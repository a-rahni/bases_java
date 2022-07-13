package heritage.TpHeritage;

public class EtudiantRegulier extends Etudiant{
    private  double noteMoy;

    public EtudiantRegulier(String nom, int anneeEntree, String section, double noteMoy) {
        super(nom, anneeEntree, section);
        this.noteMoy = noteMoy;
    }

    public double getNoteMoy() {
        return noteMoy;
    }

    public void setNoteMoy(double noteMoy) {
        this.noteMoy = noteMoy;
    }

    @Override
    public String toString() {
        return String.format("Etudiant Rédulier:\n")+super.toString()+ String.format("Moyenne: %.2f\n",noteMoy);
    }
}
