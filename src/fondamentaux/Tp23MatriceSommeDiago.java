package fondamentaux;

import java.util.Arrays;

/**
 * Ecrire une méthode qui reçoit une matrice carré et qui ensuite qui retourne la somme des 2 diagonales.
 */

public class Tp23MatriceSommeDiago {

    public static int sumDiagonale(int[][] tab){
        int sumDiag1 = 0;
        int sumDiag2 = 0;
        for (int i =0;i< tab.length; i++){
            if(tab.length != tab[i].length){
                System.out.println("la matrice doit être carrée");
                sumDiag1 = 0; sumDiag2 = 0;
                break;
            }
            sumDiag1 += tab[i][i];
            sumDiag2 += tab[i][tab.length-1-i];
        }

        return sumDiag1+sumDiag2;
    }

    public static void main(String[] args) {

        int[][] tab ={
                {1,4,2,1},
                {6,3,8,9},
                {1,5,1,0},
                {1,1,1,1}
        };

        for (int[] e: tab){
            System.out.println(Arrays.toString(e));
        }

        System.out.println("somme des diagonales = "+ sumDiagonale(tab));

    }
}
