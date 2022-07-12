package fondamentaux;

import java.util.Scanner;

public class BoucleWhileV3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        Fixer le nombre de caractères à 4
//        Demander à l'utilisateur de reessayer tant que le code PIN ne contient pas
//        exactement 4 chiffres

        int codePIN =0;
        while(true) {
//        Définition du code PIN
            System.out.print("Veuillez définir un code PIN de 4 chiffre : ");
            codePIN= input.nextInt();

            if((codePIN/1000) > 0 && (codePIN/10000) == 0){
                break;
            }

            // autre façon
//            if(String.valueOf(codePIN).length()==4){
//                System.out.println("Code PIN défini avec succès");
//                break;
//            }
//            System.out.println("Erreur : Le code PIN doit être composé de 4 chiffres");
        }

//        Essayer de deverouiller le téléphone avec un code PIN
        int codePINATester;

//        Limiter le nombre de tentatives à 3.Mais ne pas utiliser une boucle for
        // si au bout de 3 tentatives, le code PIN n'est toujours pas correct,
        // alors on affiche "votre appareil est bloqué, et on sort de la boucle
        int nbrTentatives = 0;
        while (true){
            System.out.print("Entrer un code PIN pour déverouiller l'appareil " +
                    ": ");
            codePINATester=input.nextInt();//1234
            if(codePINATester==codePIN){
                System.out.println("**************************");
                System.out.println("** Appareil déverouillé **");
                System.out.println("**************************");
                break;
            }

            nbrTentatives++;
            if(nbrTentatives>=3){
                System.out.println("votre appareil est bloqué");
                break;
            }else {
                System.out.println("Code PIN Erroné.Veuillez reessayer");
            }


        }
    }
}