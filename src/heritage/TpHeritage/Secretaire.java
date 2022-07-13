package heritage.TpHeritage;

public class Secretaire extends Employee{
    public Secretaire(String nom, int anneeEntree, String laboratoire, double salaire) {
        super(nom, anneeEntree, laboratoire, salaire);
    }

    @Override
    public String toString() {
        return String.format("Secretaire:\n")+ super.toString();
    }
}
