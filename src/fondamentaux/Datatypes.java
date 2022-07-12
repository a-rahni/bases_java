package fondamentaux;

public class Datatypes {
    public static void main(String[] args) {
        // chaine de caractères
        String prenom = "christian";
        String nom = "Lisangola";

        // caractère
        char genre = 'm';

        // réels : selon la précesion (besoin ou non de double precesion)
        // pour les float, il faut rajouter un suffix F
        float poids = 85.5F;
        float tjm = 8.4F; // tarif journalier

        // réel double précision
        double v = 45.3;

        // Byte : une variante d'entier court
        byte age = 89;

        System.out.println("Je suis "+ prenom +" "+nom+", j'ai"+ age+ "ans. Mon Tjm est de "+ tjm+ " €");

        System.out.printf("je suis %s %s, j'ai %d ans. Mon TJM est de %.1f€.\n", prenom, nom, age,tjm);
    }
}
