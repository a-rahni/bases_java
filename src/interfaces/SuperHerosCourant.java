package interfaces;

public class SuperHerosCourant extends  SuperHeros{
    private int vitesse;

    public SuperHerosCourant(String name, String dateDeNaissance, int niveauDePouvoir,
                             int vitesse) {
        super(name, dateDeNaissance, niveauDePouvoir);
        this.vitesse=vitesse;
    }

    public void courir(){
        System.out.println("Je cours très vite");
    }
}
