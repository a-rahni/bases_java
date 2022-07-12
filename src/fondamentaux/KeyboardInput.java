package fondamentaux;

import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
//        1. Demander à l'utilisateur : nom,prenom,age, poids
        // next(): prend en compte que le premier mot. nextLine: prend toute la ligne avec les espace
        System.out.print("Votre nom : ");
        String nom=input.nextLine();
//
        System.out.print("Votre prenom : ");
        String prenom=input.nextLine();

        System.out.print("Votre age : ");
        byte age=input.nextByte();

        System.out.print("Votre poids : ");
        float poids=input.nextFloat();  // faut introduire xx,yy (virgule au lieu de).

//        Nom : Lisangola
//        Prenom : Christian
//        Age : 17
//        Poids : 33
//        System.out.printf("Nom : %s\n",nom);
//        System.out.printf("Prenom : %s\n",prenom);
//        System.out.printf("Age : %d\n",age);
//        System.out.printf("Poids : %f\n",poids);

        System.out.printf("Nom : %s\nPrenom : %s\nAge : %d\nPoids : %.2f",nom,prenom,
                age,poids);

    }
}
