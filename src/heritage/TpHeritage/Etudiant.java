package heritage.TpHeritage;

public class Etudiant extends Personne{
    private String section;

    public Etudiant(String nom, int anneeEntree, String section) {
        super(nom, anneeEntree);
        this.section = section;
    }

    @Override
    public boolean estEtudiant() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString()+ String.format("Section: %s\n",section);
    }
}
