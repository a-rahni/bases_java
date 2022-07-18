package tpAgenceVoyage;

public class Transport extends OptionVoyage {
    public static final double TARIF_LONG = 1500;
    public static final double TARIF_BASE = 200;
    private boolean trajetLong;

    public Transport(String nom, double prixForfaitaire, boolean trajetLong) {
        super(nom, prixForfaitaire);
        this.trajetLong = trajetLong;
    }

    public Transport(String nom, double prixForfaitaire) {
        this(nom, prixForfaitaire, false);
    }

    @Override
    public double prix(){
        return ((trajetLong?TARIF_LONG:TARIF_BASE)+super.prix());
    }

    @Override
    public String toString() {
        return String.format("%s -> %.3f €\n",super.getNom(),this.prix() );
    }
}
