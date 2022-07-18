package heritage.TpHeritage;

public abstract class Personne {
    private  String nom;
    private  int anneeEntree;

    public Personne(String nom,int anneeEntree){
        this.nom=nom;
        this.anneeEntree=anneeEntree;
    }

    /** pour le but de montrer le polymorphisme
     * si on applique le principe de segregation d'interface, un enseignant n 'a pas besoin
     * d'attribut pour savoir qu'iln 'est pas étudiant
     * */
    public abstract boolean estEtudiant();

    @Override
    public String toString() {
        return String.format("Nom: %s\nDate d'entrée: %d\n",nom,anneeEntree);
    }
}
