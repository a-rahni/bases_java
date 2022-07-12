package fondamentaux;

import java.util.Scanner;

public class BoucleWhileV2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

//        Définition du code PIN
        System.out.print("Veuillez définir un code PIN : ");
        int codePIN=input.nextInt();

//        Essayer de deverouiller le téléphone avec un code PIN
        int codePINATester;

        while (true){
            System.out.print("Entrer un code PIN pour déverouiller l'appareil " +
                    ": ");
            codePINATester=input.nextInt();//1234
            if(codePINATester!=codePIN){
                System.out.println("Code PIN Erroné.Veuillez reessayer");
            }else{
                System.out.println("**************************");
                System.out.println("** Appareil déverouillé **");
                System.out.println("**************************");
                break;
            }
        }
    }
}