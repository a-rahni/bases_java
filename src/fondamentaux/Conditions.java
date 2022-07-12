package fondamentaux;

import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {
        //var input=new Scanner(System.in); // java 18
        Scanner input = new Scanner(System.in);
        System.out.print("Votre age : ");
        byte age = input.nextByte();

//        > = : Supérieur ou égal
//        < = : Inférieur ou égal
//        = = : égalité.A ne pas confondre avec l'affectation(=)
//        ! = : Différent de

        boolean estMajeur = age >= 18;//true//false
        // Si age > = 18 alors
        // Afficher "Vous êtes majeur"
        //Sinon
        // Afficher "Vous êtes mineur"
        if (estMajeur) {
            System.out.println("Vous êtes majeur.");
        } else {
            System.out.println("Vous êtes mineur");
        }

        //        Test d'égalité
        int a = 1, b = 2;
        if (a != b) {
            System.out.println("a et b sont différents");
        } else {
            System.out.println("a et b sont égaux");
        }

        //     Utilisation des expression dans les tests conditionnels

        if (a * 2 > b * 2) {//2 > 4
            System.out.println("a*2 est > b*2");
        } else {
            System.out.println("a*2 n'est pas > b*2");
        }

    }

}
