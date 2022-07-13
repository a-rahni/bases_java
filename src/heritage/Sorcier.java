package heritage;

public class Sorcier extends Magicien {
    private String batonMagique;

    public Sorcier(String nom, int dureeDeVie, String baguette, String batonMagique) {
       super(nom,dureeDeVie,baguette);
       this.batonMagique = batonMagique;
    }

    public String getBatonMagique() {
        return batonMagique;
    }

    public void setBatonMagique(String batonMagique) {
        this.batonMagique = batonMagique;
    }

    @Override
    public void rencontrer(){
        System.out.println("Je vais te transformer en biscuit.");
    }

    @Override
    public String toString() {
        return super.toString()+String.format("Baton magique : %s",batonMagique);
//        return String.format("Nom : %s\nDurée de vie : %d\nBaguette : %s\nBaton magique" +
//                        " : %s\n",nom,dureeDeVie,
//                baguette,batonMagique);
    }
}