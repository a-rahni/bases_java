package interfaces;

public class SuperHeros extends Personnage{
    private int niveauDePouvoir;

    public SuperHeros(String name, String dateDeNaissance,int niveauDePouvoir) {
        super(name, dateDeNaissance);
        this.niveauDePouvoir=niveauDePouvoir;
    }
}
