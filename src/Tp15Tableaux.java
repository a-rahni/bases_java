import java.util.Arrays;
import java.util.Scanner;

/**
 * Ecrire un algorithme qui demande l’utilisateur de créer 2 listes composées de nombres.
 * Ensuite, remplir ces 2 listes à partir de la lecture du clavier tout en sachant que ces 2 listes
 * doivent avoir la même taille(aussi définie par une lecture).Puis, calculer la liste résultante  qui va
 * être construite par la somme des éléments de la première liste et avec l’inverse de la 2ème liste.
 * Exemple :
 * Liste 1 : [ 2 , 4 , 5 , 7 ,8 ]
 * Liste 2 : [ 3 , 7 , 2 , 5 , 6 ]
 * List 3(résultante) : [ 8(2+6) , 9(4+5), 7(5+2) , 14(7+7), 11(8+3) ]
 */

public class Tp15Tableaux {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entrez une taille (même) pour les deux tableaux: ");
        int taille = input.nextInt();
        int[] tab1 = new int[taille];
        int[] tab2 = new int[taille];
        int[][] tabMultiD= {tab1,tab2};

        for(int i=0; i< tabMultiD.length;i++) {
            System.out.printf("Remplir le tableau %d: \n", i+1);
            for (int j = 0; j < tabMultiD[i].length; j++) {
                System.out.printf("valeur %d : ", i + 1);
                tabMultiD[i][j] = input.nextInt();
            }
        }

        int[] tabResultat = new int[taille];
        for(int i=0;i<tab1.length; i++){
            tabResultat[i]=tab1[i]+tab2[taille-i-1];
        }

        for (int i=0;i<tabMultiD.length;i++){
            System.out.printf("T%d:", i+1);
            System.out.println(Arrays.toString(tabMultiD[i]));
        }
        System.out.println("Liste resultat:"+ Arrays.toString(tabResultat));

    }
}
