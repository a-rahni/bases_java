import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Entrez un nombre entier:");

        int nbr= input.nextInt();
        boolean estPair = ((nbr%2) == 0);

        if( nbr == 0){
            System.out.print("le nombre est Zero");
        }else if(nbr > 0){
            System.out.print("le nombre est positif");
        }else{
            System.out.print("le nombre est négatif");
        }
        System.out.print(" et ");
        if(true == estPair){
            System.out.print("pair");
        }else{
            System.out.print("impair");
        }

        // autre facon de faire
        String parite = ((nbr%2)==0?"pair": "impair");
        if( nbr == 0){
            System.out.printf("%d est zero et %s", nbr, parite);
            System.out.printf("zero et pair");
        }else if(nbr > 0){
            System.out.printf("%d est positif et %s", nbr, parite);
            System.out.printf("%d est positif et %s", nbr, estPair?"pair":"impair");
        }else{
            System.out.printf("%d est négatif et %s", nbr, parite);
            System.out.printf("%d est négatif et %s", nbr, estPair?"pair":"impair");
        }


    }
}
