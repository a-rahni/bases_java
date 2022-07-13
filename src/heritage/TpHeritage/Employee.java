package heritage.TpHeritage;

public class Employee extends Personne{
    private String laboratoire;
    private double salaire;

    public Employee(String nom, int anneeEntree, String laboratoire, double salaire) {
        super(nom, anneeEntree);
        this.laboratoire = laboratoire;
        this.salaire = salaire;
    }
    @Override
    public boolean estEtudiant(){
        return false;
    };

    @Override
    public String toString() {
        return super.toString()+ String.format("Laboratoire: %s\nSalaire: %.2f €\n",laboratoire,salaire);
    }
}
