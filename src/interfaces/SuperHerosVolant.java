package interfaces;

public class SuperHerosVolant extends SuperHeros implements Voler{
    private double altitude;

    public SuperHerosVolant(String name, String dateDeNaissance, int niveauDePouvoir,
                            int altitude) {
        super(name, dateDeNaissance, niveauDePouvoir);
        this.altitude=altitude;
    }


    public void voler(){
        System.out.println("Je peux voler");
    }
}
