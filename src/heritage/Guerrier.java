package heritage;

public class Guerrier extends Personnage {
    private String arme;

    public Guerrier(String nom, int dureeDeVie, String arme) {
        super(nom,dureeDeVie);
        this.arme = arme;
    }


    public String getArme() {
        return arme;
    }

    public void setArme(String arme) {
        this.arme = arme;
    }
@Override
    public void rencontrer(){
        System.out.println("Je vais te tuer");
    }


    @Override
    public String toString() {
        return super.toString()+String.format("Arme : %s",arme);
//        return String.format("Nom : %s\nDurée de vie : %d\nArme : %s\n",nom,dureeDeVie,
//                arme);
    }
}
