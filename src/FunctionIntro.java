import java.util.Locale;
import java.util.Scanner;

import static java.lang.Character.toLowerCase;

public class FunctionIntro {

    // pour type primitif, en java il n y a que le passage par valeur : pas de modif de ara

    static  int somme(int nombre1, int nombre2){
        int resultat = nombre1+nombre2;
        return resultat;
    }

    static String deleteSpecialChars(String chaine){
        // maivaise approche
        //chaine = chaine.replaceAll([^A-Za-z],"").toLowerCase();
        //return chaine;
        // bonne approche
        String newStr=chaine.replaceAll("[^A-Za-z]","").toLowerCase();
        return newStr;
    }

    // passage en valeur!! meme tableau!!
    static int sumArray(int[] numbersArray){
        int sum = 0;
        for(int number:numbersArray){
            sum = sum + number;
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(somme(4,5));

        System.out.println(deleteSpecialChars("papy est gentil"));

        // Demande de siasie utilisateur
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez les 2 nombres: ");
        //System.out.println(somme(input.nextInt(),input.nextInt())); // eviter cette ecriture: non lisible
        int nb1=input.nextInt();
        int nb2=input.nextInt();
        System.out.println(somme(nb1,nb2));

        // function with arrays  : c'est la refrence qui est recopie mais il y aune difference avec le langage C
        //
        int[] numbers ={2,3,4,5,6,7,8};
        System.out.println(sumArray(numbers));

    }
}
