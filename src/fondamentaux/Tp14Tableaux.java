package fondamentaux;

import java.util.Scanner;

/**
 * Écrire un programme Java qui demande à l’utilisateur de remplir un tableau d’entiers à partir du clavier.
 * Puis le programme devra lui demander d’entrer un nombre à rechercher dans le tableau.
 * Si nombre existe, le programme lui dira que le nombre existe et le nombre de fois qu’ils se retrouve dans le tableau
 * Sinon le programme lui dira que le nombre recherché n’existe pas dans le tableau
 * Ex : tableau saisi à partir du clavier : 12,45,6,7,12,23,33,6,22,3,6
 * ->Entrer un nombre à rechercher : 6
 * ->6 existe et se retrouve 3 fois dans le tableau
 */
public class Tp14Tableaux {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau: ");
        int taille = input.nextInt();
        int[] tab = new int[taille];

        for(int index = 0;index<taille;index++){
            System.out.printf("valeur %d : ",index+1);
            tab[index]=input.nextInt();
        }

        System.out.println( "*** recherche d'une valeur dans le tableau ***");
        System.out.printf("Entrez un nombre à rechercher : ");
        int valRech = input.nextInt();

        int nbrOccurence = 0;
        for(int e:tab){
            if(e == valRech) nbrOccurence++;
        }
        if(nbrOccurence==0){
            System.out.println(" le nombre recherché n'existe pas ");
        }else{
            System.out.printf("%d existe et se retrouve %d fois dans le tableau", valRech,nbrOccurence);
        }

    }
}
