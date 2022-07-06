import java.util.Scanner;

/**
 * Ecrire un programme Java qui permet à l’utilisateur de définir une adresse email et un mot de passe.
 * Ensuite dans un second temps, il sera demandé à l’utilisateur de fournir l’email et le mot de passe:
 * Si l’email et le mot de passe ne correspondent pas aux valeurs définies, le message “Identifiants incorrect devra
 * s’afficher”, et l’utilisateur devra recommencer la saisie des valeurs.
 * Sinon, le message “Bienvenu dans votre espace client” devra s’afficher.
 * TP10.
 * A l’exercice précédent, s’ajoute un nouveau requirement:
 * Le nombre de fois que l’utilisateur peut saisir des mauvais identifiants est limité à 5, ensuite le programme va s’arrêter avec un message disant.
 * “Vous avez saisi des mauvais identifiants x fois, votre compte est bloqué“.
 * Il faut dire à au user le nombre de tentatives restants
 */


public class TP9Et10IdentiConnexionBoucle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("*** Definition adress email et mot de passe ****");
        System.out.print("Definir votre email: ");
        String email = input.next();

        System.out.print("Definir votre mot de passe : ");
        String password = input.next();

        String readEmail ="";
        String readPassword ="";
        int nbrTentativesRestant = 5;

        System.out.println("*** Connexion ****");
        while (true){

            System.out.print("Email: ");
            readEmail = input.next();

            System.out.print("Password: ");
            readPassword = input.next();

            if (email.equals(readEmail) && password.equals(readPassword)){
                System.out.println("Bienvenu dans votre espace client");
                break;
            }
            nbrTentativesRestant--;
            if(nbrTentativesRestant == 0){
                System.out.println("Vous avez saisi des mauvais identifiant 5 fois, votre compte est bloqué");
                break;
            }
            System.out.printf("Identifiants incorrect, il vous reste %d tentatives \n",nbrTentativesRestant);
        }


    }
}
