import java.util.Arrays;
import java.util.Scanner;

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
