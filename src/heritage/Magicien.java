package heritage;

public class Magicien extends Personnage {
    private String baguette;

    public Magicien(String nom, int dureeDeVie, String baguette) {
        super(nom,dureeDeVie);
        this.baguette = baguette;
    }


    public String getBaguette() {
        return baguette;
    }

    public void setBaguette(String baguette) {
        this.baguette = baguette;
    }
@Override
    public void rencontrer(){
        System.out.println("Je vais te faire disparaitre");
    }

    @Override
    public String toString() {
        return super.toString()+String.format("Baguette : %s\n",baguette);
//        return String.format("Nom : %s\nDurée de vie : %d\nBaguette : %s\n",nom,
//                dureeDeVie,
//                baguette);
    }
}
