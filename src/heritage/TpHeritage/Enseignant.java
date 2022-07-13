package heritage.TpHeritage;

public class Enseignant extends  Employee{
    private String section;

    public Enseignant(String nom, int anneeEntree, String laboratoire, double salaire, String section) {
        super(nom, anneeEntree, laboratoire, salaire);
        this.section = section;
    }

    @Override
    public String toString() {
        return String.format("Enseigant:\n")+ super.toString()+ String.format("Section d'enseignement: %s\n",section);
    }
}
