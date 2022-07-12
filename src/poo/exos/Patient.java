package poo.exos;

/**
 * Le but de cet exercice est de créer des « patients » qui ont un poids et une taille,et de calculer leur
 * « Indice de Masse Corporelle» (IMC).
 * crée un patient,
 * affiche les données du patient ainsi que son IMC.
 * Avoir la possibilité de connaître la taille du patient, son poids
 * Pour calculer l’IMC veuillez lire ceci : https://www.santemagazine.fr/minceur/imc-indice-de-masse-corporelle-267579
 */
public class Patient {
    private String nom;
    private String prenom;

    private float poids;
    private  float taille;

    public Patient(String nom, String prenom, float poids ,float taille ){
        this.nom = nom;
        this.prenom = prenom;
        this.poids = poids;
        this.taille = taille;
    }

    public double computeIMC(){
        return (poids/(Math.pow(taille,2)));
    }

    public String toString(){
        return String.format("%s %s\nIMC: %.2f",prenom,nom,computeIMC());
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public float getPoids() {
        return poids;
    }

    public float getTaille() {
        return taille;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }

    public void setTaille(float taille) {
        this.taille = taille;
    }
}
