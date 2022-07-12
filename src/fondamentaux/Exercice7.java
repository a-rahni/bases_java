package fondamentaux;

import java.util.Scanner;

public class Exercice7 {

    public static void main(String[] args) {
//        Ecrire un programme qui permet à l’utilisateur de saisir un entier entre 1 et 12 et
//        qui affiche le nom du mois correspondant.


        Scanner input = new Scanner(System.in);
        System.out.println("Entrez le numero du mois: ");

        int mois = input.nextInt();

        switch (mois){
            case 1:
                System.out.println("Janvier");
                break;
            case 2:
                System.out.println("Fevrier");
                break;
            case 3:
                System.out.println("Mars");
                break;
            case 4:
                System.out.println("Avril");
                break;
            case 5:
                System.out.println("Mai");
                break;
            case 6:
                System.out.println("Juin");
                break;
            case 7:
                System.out.println("Juillet");
                break;
            case 8:
                System.out.println("Aout");
                break;
            case 9:
                System.out.println("Septembre");
                break;
            case 10:
                System.out.println("Octobre");
                break;
            case 11:
                System.out.println("Novembre");
                break;
            case 12:
                System.out.println("Decembre");
                break;
            default:
                System.out.println("le numero doit être entre 1 et 12");
                break;
        }
    }
}
