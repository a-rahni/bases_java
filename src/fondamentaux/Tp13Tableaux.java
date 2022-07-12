package fondamentaux;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Ecrire un programme Java qui permet à l’utilisateur de déclarer 3 array d’entiers.
 * Ces tableaux ne doivent pas forcément avoir la même taille
 * Le programme doit ensuite fournir afficher les 3 tableaux en format [element1, element2,...,elementN] et
 * la somme de tous les éléments multiples 3 dans les 3 tableaux.
 * Ex :
 * T1 : [ 2, 6, 8, 15,39,11 ]
 * T2 : [ 21, 33, 12, 19,0 ]
 * T3 : [ 17, 18, 46 ]
 * S = 6+15+39+21+33+12+18 = 144
 */
public class Tp13Tableaux {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] t1 ={2,6,8,15,39,11};
        int[] t2 = {21,33,12,19,0};
        int[] t3 ={17,18,46};

        int[][] tabMultiD= {t1,t2,t3};


        for (int i=0;i<tabMultiD.length;i++){
            System.out.printf("T%d:", i+1);
            System.out.println(Arrays.toString(tabMultiD[i]));
        }

        int somme = 0;
        System.out.print("S = ");
        for(int[] t:tabMultiD){
            for(int e:t){
                if((e%3 == 0) && (e/3>0) ){
                    somme+=e;
                    System.out.printf("%d+",e);
                }
            }
        }
        System.out.printf(" = %d", somme);
    }
}
