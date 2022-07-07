import java.util.Scanner;

/**
 * Ecrire un programme Java demande à l’utilisateur de saisir un text et qui ensuit, retourne la chaine inverse
 */

public class TP16StringInverse {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf(" Votre chaine: ");
        String chaine= input.nextLine();

        String chaineInverse="";
        for(int i=0;i<chaine.length(); i++){
            chaineInverse= chaine.charAt(i)+chaineInverse;
        }
        System.out.printf("chaine inverse 1: %s \n", chaineInverse);


        // utilisation string buffer
        StringBuffer s1 = new StringBuffer(chaine);
        s1.reverse();
        String chInverse= s1.toString();
        System.out.printf("chaine inverse 2: %s \n", chInverse);
    }
}
