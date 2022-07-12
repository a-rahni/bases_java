package fondamentaux;

public class BoucleFor {
    public static void main(String[] args){
        //        System.out.printf("Le carré de 1 est %f",Math.pow(1,2));
//        System.out.printf("Le carré de 2 est %f",Math.pow(2,2));
//        System.out.printf("Le carré de 3 est %f",Math.pow(3,2));
//        System.out.printf("Le carré de 4 est %f",Math.pow(4,2));
//        System.out.printf("Le carré de 5 est %f",Math.pow(5,2));
//        System.out.printf("Le carré de 6 est %f",Math.pow(6,2));
//        System.out.printf("Le carré de 7 est %f",Math.pow(7,2));
//        System.out.printf("Le carré de 8 est %f",Math.pow(8,2));
//        System.out.printf("Le carré de 9 est %f",Math.pow(9,2));
//        System.out.printf("Le carré de 10 est %f",Math.pow(10,2));

        // Pour compteur allant de 1 à 10
        // Afficher le carre du nombre
        // compteur = compteur + 1
        //Fin pour
        for(int compteur=1;compteur<=1000;compteur = compteur+1){
            System.out.printf("Le carre %d est %.1f\n",compteur,Math.pow(compteur,2));
        }
    }
}
