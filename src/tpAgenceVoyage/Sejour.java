package tpAgenceVoyage;

public class Sejour extends OptionVoyage{
    private int nombreNuits;
    private double prixNuit;

    public Sejour(String nom, double prixForfaitaire, int nombreNuits, double prixNuit) {
        super(nom, prixForfaitaire);
        this.nombreNuits = nombreNuits;
        this.prixNuit=prixNuit;
    }
    @Override
    public double prix(){
        return ((nombreNuits*prixNuit)+super.prix());
    }

    @Override
    public String toString() {
        return String.format("%s -> %.3f €\n",super.getNom(),this.prix() );
    }


}
