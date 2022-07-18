package tpAgenceVoyage;

public class OptionVoyage {
    private String nom;
    private double prixForfaitaire;

    public OptionVoyage(String nom, double prixForfaitaire) {
        this.nom = nom;
        this.prixForfaitaire = prixForfaitaire;
    }

    public String getNom() {
        return nom;
    }

    public double prix() {
        return prixForfaitaire;
    }

    public void setPrixForfaitaire(double prixForfaitaire) {
        this.prixForfaitaire = prixForfaitaire;
    }

    @Override
    public String toString() {
        return String.format("%s -> %.3f\n",nom, prixForfaitaire);
    }
}
