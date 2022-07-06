import java.util.Scanner;

/** utiliser les boucles
 * Écrivez un programme Java qui demande à l’utilisateur d’entrer un nombre et qui ensuite va
 * calculer et afficher la factorielle de ce nombre:
 * Exp: Factorielle de 3 : 3x2x1 = 6
 */

public class TP8FactorielleBoucle {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.printf("Entrez un nombre: ");
        int nbr = input.nextInt();
        int fact = 1;
        System.out.printf("Factorielle de %d :", nbr);
        for (int n = nbr; n> 0; n--){
            fact *=n;
            if (n==1){System.out.printf("%d",n);} else{ System.out.printf("%dx",n);}
        }
        System.out.printf(" = %d \n",fact);
    }
}
