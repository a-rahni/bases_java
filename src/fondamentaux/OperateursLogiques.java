package fondamentaux;

import java.util.Scanner;

public class OperateursLogiques {

    public static void main(String[] args){
        // Demander à l'utilisateur son age
// si l'age en 10 et 19 alors => [10,19]
// Afficher "Vous êtes ado"
//Sinon
// Afficher "Vous n'êtes pas ado"
        Scanner input=new Scanner(System.in);
        System.out.print("Votre age : ");
        byte age=input.nextByte();//10

// 10>=10 && 10<=19
// Opérateur logique ET/AND
        if(age>=10 && age<=19){
            System.out.println("Vous êtes ado");
        }else{
            System.out.println("Vous n'êtes pas ado");
        }

// Opérateur logique OU/OR
// -2 => faux OU vrai
        if(age>=10 || age<=19){
            System.out.println("Correct");
        }else {
            System.out.println("Incorrect");
        }
    }
}
