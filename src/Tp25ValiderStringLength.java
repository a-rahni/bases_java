import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Ecrire un fonction qui permet de valider la longueur d’une chaîne.
 * Il doit avoir 3 paramètres : chaine,min,max.
 * Elle retourne 1(vrai), si la taille de est entre min et max
 * Elle retourne 0(faux), si la taille n’est pas entre min et max
 * Créer ensuite un programme qui permet à l’utilisateur de créer un compte avec :
 * Pseudo : (min : 5,max : 10)
 * Nom :(min : 4, max : 30)
 * Prénom : (min : 2, max : 30)
 * Mot de passe : (min : 8, max : 50)
 * Email valide
 * Tant que les requirement ne sont pas remplis, on demande à l’utilisateur de recommencer
 */


public class Tp25ValiderStringLength {

    public static boolean lengthIsValid(String chaine, int min, int max){
        if(chaine.length()< min || chaine.length() > max){
            return false;
        }
        return true;
    }

    public static boolean emailIsValid(String email){
        Pattern p = Pattern
                .compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}$");
        Matcher m = p.matcher(email.toUpperCase());
        return m.matches();

        //String chFormatee = email.replaceAll("[^A-Z0-9a-z]","").toUpperCase();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true) {

            System.out.print("Pseudo (5-10 char): ");
            String pseudo = input.nextLine();
            System.out.print("Nom (4-30 char): ");
            String nom = input.nextLine();
            System.out.print("Prenom (2-30 char): ");
            String prenom = input.nextLine();
            System.out.print("Mot de passe (8-50 char): ");
            String motPasse = input.nextLine();
            System.out.print("Email: ");
            String email = input.next();

            boolean valid = lengthIsValid(pseudo,5,10) &&
                    lengthIsValid(nom,4,30) &&
                    lengthIsValid(prenom,2,30) &&
                    lengthIsValid(motPasse,8,50) &&
                    emailIsValid(email);
            if(valid){
                System.out.println("Votre conte est créé");
                break;
            }
            else{
                if(!lengthIsValid(pseudo,5,10)){
                    System.out.printf("le pseudo doit se composer de %d à %d caractères.\n", 5,10);
                }
                if(!lengthIsValid(nom,4,30)){
                    System.out.printf("le nom doit se composer de %d à %d caractères.\n", 4,30);
                }
                if(!lengthIsValid(prenom,2,30)){
                    System.out.printf("le pseudo doit se composer de %d à %d caractères.\n", 2,30);
                }
                if(!lengthIsValid(motPasse,8,50)){
                    System.out.printf("le mot de passe doit se composer de %d à %d caractères.\n", 8,50);
                }
                if(!emailIsValid(email)){
                    System.out.printf("l'Email  doit être valide.\n");
                }

                System.out.println("Veuillez saisir a nouveau vos données :  ");
            }
        }

    }
}
