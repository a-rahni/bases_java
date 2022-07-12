package poo.exos;

public class MainExos {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();

        float aire = r1.getAire();
        float perimetre = r1.getPerimetre();

        System.out.printf(" aire: %.2f  perimetre: %.2f \n", aire,perimetre );

        r1.setLargeur(5.5f);
        r1.setLongueur(2.0f);
        aire = r1.getAire();
        perimetre = r1.getPerimetre();
        System.out.printf(" aire: %.2f  perimetre: %.2f \n", aire,perimetre );

    }
}
