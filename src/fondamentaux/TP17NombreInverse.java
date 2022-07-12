package fondamentaux;

import java.util.Scanner;

/**
 * Ecrire un programme Java demande à l’utilisateur de saisir un nombre, et qui ensuite affiche le nombre inverse.
 * Ex : * Votre nombre : 17   * Résultat : 71
 * Votre nombre : -89         * Résultat : -98
 * Votre nombre : -20         * Résultat : -2(Car le zéro devant un nombre n’est pas pris en compte)
 */
public class TP17NombreInverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf(" Votre nombre: ");
        int nbr= input.nextInt();

        int nbrManip= Math.abs(nbr);
        int nbrInverse = 0;

        while((nbrManip/10) >0){
            nbrInverse = (nbrInverse*10) + (nbrManip%10);
            nbrManip /= 10;
        }
        nbrInverse = (nbrInverse*10) + (nbrManip%10);
        if(nbr<0) nbrInverse *= (-1);


        System.out.printf("nombre inverse 1: %d \n",nbrInverse);

    }
}
