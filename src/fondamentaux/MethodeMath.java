package fondamentaux;

public class MethodeMath {
    public static void main(String[] args) {
        //        Convention pour les constantes en Java
//        Snake case + toutes les lettres en maj
        final double ACCELERATION_PESANTEUR=9.8;

//        Surface = Rayon * Rayon * PI

//        Approche 1 : Sans classe utilitaire Math
        double rayon=5.555;
        final double PI=3.14;
        double surface=rayon*rayon*PI;

//        Approche 2 : Avec classe utilitaire Math

//        Math.pow(..) : Elever un nombre à puissance donnée
        double surface2=Math.pow(rayon,2)*Math.PI;
        System.out.println(surface2);

//        Calcul de la racine carrée
        double racineDe9=Math.sqrt(9);
        System.out.println(racineDe9);
    }
}
