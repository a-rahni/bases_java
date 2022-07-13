package heritage.TpHeritage;

public abstract class Personne {
    private  String nom;
    private  int anneeEntree;

    public Personne(String nom,int anneeEntree){
        this.nom=nom;
        this.anneeEntree=anneeEntree;
    }

    public abstract boolean estEtudiant();

    @Override
    public String toString() {
        return String.format("Nom: %s\nDate d'entrée: %d\n",nom,anneeEntree);
    }
}
