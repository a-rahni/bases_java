import java.util.Scanner;

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
