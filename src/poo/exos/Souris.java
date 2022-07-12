package poo.exos;

/**
 * enoncé de l'exercice est à la fin du fichier
 * */
public class Souris {
        private final int ESPERANCE_VIE_DEFAUT = 36;
        private final int AGE_DEFAUT = 0;
        private int poids; // gramme
        private String couleur;
        private int age; // en mois
        private int esperanceVie;
        private boolean clonee;

    public Souris( int poids, String couleur,int age, int esperanceVie){
        this.poids = poids;
        this.couleur = couleur;
        this.age = age;
        this.esperanceVie = esperanceVie;
        this.clonee = false;

        System.out.println("une nouvelle souris!");
    }
    public Souris( int poids, String couleur,int age){
        this.poids = poids;
        this.couleur = couleur;
        this.age = age;
        this.esperanceVie = ESPERANCE_VIE_DEFAUT;
        this.clonee = false;

        System.out.println("une nouvelle souris!");
    }

    public Souris( int poids, String couleur){
        this.poids = poids;
        this.couleur = couleur;
        this.age = AGE_DEFAUT;
        this.esperanceVie = ESPERANCE_VIE_DEFAUT;
        this.clonee = false;

        System.out.println("une nouvelle souris!");
    }

        // constructeur de copie
    public Souris(Souris souris) {
        this.poids = souris.poids;
        this.couleur = souris.couleur;
        this.age = AGE_DEFAUT;
        this.esperanceVie = (4 * souris.esperanceVie) / 5;
        this.clonee = true;

        System.out.println("Clonage d'une souris!");
    }

    public String toString () {
        String estClone = clonee ? "clonée," : "";
        return String.format(" Une souris %s,%s de %d mois et pesant %d grammes", couleur, estClone, age, poids);
    }

    public void vieillir () {
        this.age++;
        if (this.clonee) {
            if (this.age >= (esperanceVie / 2)) {
                this.couleur = "Verte";
            }
        }
    }

    public void evolue () {
        while (this.age < this.esperanceVie) {
            this.vieillir();
        }
    }


}
/**
 * TP 4
 * Le but de cet exercice est de créer des « souris » par différents biais et de les faire « évoluer » au cours du temps.
 * Le corps de la classe Souris manque et c’est ce qu’il vous est demandé d’écrire.
 * Une souris est caractérisée par son poids en grammes (un int), sa couleur (une String), son âge en mois (un int),
 * son espérance de vie (un int) et une indication sur le fait qu’elle soit clonée ou pas (un booléen).
 * Ces attributs seront nommés respectivement : poids, age, couleur, esperanceVie et clonee.
 * Par ailleurs, les méthodes publiques de la classe Souris sont :
 * des constructeurs conformes à la méthode main fournie, avec l’ordre suivant pour les paramètres : le poids,
 * la couleur, l’âge et l’espérance de vie. Ces deux derniers paramètres ont pour valeur par défaut zéro et 36
 * respectivement. La valeur 36 est stockée dans une constante fournie que vous utiliserez en
 * écrivant ESPERANCE_VIE_DEFAUT. Les constructeurs afficheront le message Une nouvelle souris ! ;
 * un constructeur de copie qui doit afficher le message Clonage d’une souris ! ;
 * une souris clonée a les mêmes caractéristiques que la souris d’origine, sauf son espérance de vie qui est moindre :
 * les 4 cinquième de celle de la souris d’origine ;
 * une méthode toString() produisant une représentation d’une Souris respectant strictement le format suivant :
 * Une souris <couleur>[, clonée,] de <age> mois et pesant <poids> grammes (sur une seule ligne) où <age> est à
 * remplacer par l’âge de la souris et <poids> par son poids. Le bout de phrase « , clonée, » ne sera affiché que si
 * la souris a été clonée ;
 * une méthode vieillir qui augmentera d’une unité l’âge de la souris. Si la souris est clonée, elle doit devenir
 * verte si elle atteint un âge supérieur à la moitié de son espérance de vie ; même si elle n’est pas appelée
 * explicitement dans la méthode main(), cette méthode doit être publique ; elle sera testée ;
 * et une méthode évolue faisant vieillir la souris depuis son âge courant jusqu’à son espérance de vie.
 * Tous les affichages demandés se feront sur le terminal et seront terminés par un saut de ligne.
 * Exemple d’exécution
 * Une nouvelle souris !
 * Une nouvelle souris !
 * Clonage d’une souris !
 * Une souris blanche de 2 mois et pesant 50 grammes
 * Une souris grise de 0 mois et pesant 45 grammes
 * Une souris grise, clonée, de 0 mois et pesant 45 grammes
 * Une souris blanche de 36 mois et pesant 50 grammes
 * Une souris grise de 36 mois et pesant 45 grammes
 * Une souris verte, clonée, de 28 mois et pesant 45 grammes
 * */