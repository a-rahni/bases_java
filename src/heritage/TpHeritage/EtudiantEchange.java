package heritage.TpHeritage;

public class EtudiantEchange extends Etudiant {
    private String universiteOrigine;

    public EtudiantEchange(String nom, int anneeEntree, String section, String universiteOrigine) {
        super(nom, anneeEntree, section);
        this.universiteOrigine = universiteOrigine;
    }

    @Override
    public String toString() {
        return String.format("Etudiant d'echange:\n")+super.toString()+ String.format("Université d'origine: %s\n",universiteOrigine);
    }
}
