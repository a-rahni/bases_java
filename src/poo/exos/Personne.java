package poo.exos;

public class Personne {
    private String nom;
    private String prenom;
    private boolean Celibataire;
    private int nombreEnfants;



    public String nomComplet(){
        String etatCivil = (this.Celibataire?"Célibataire":"Marié(e)");
        return String.format("%s %s \n%s \n%d enfants ",prenom,nom, etatCivil,nombreEnfants);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNombreEnfants(int nombreEnfants) {
        this.nombreEnfants = nombreEnfants;
    }

    public void setCelibataire(boolean estCelibataire) {
        Celibataire = estCelibataire;
    }



    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getNombreEnfants() {
        return nombreEnfants;
    }

    public boolean isCelibataire() {
        return Celibataire;
    }



}
