package fondamentaux;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
        // switch est utilisé seulement pour un test d'égalité avec alternative multiples

        // switch sur objet: que sur des string (on maitraise le contenu). ou un attribut d'un objet ..

        //Demander d'entrer le nom d'un pays
// si nom du pays est "France" alors
// Affiche "Bonjour"
//Sinon so nom est "Espagne" alors
//On affiche "hola"
//Sinon si nom est "Allemagne" alors
// On affiche "Guten tag"
//Sinon si nom est "Angleterre"
// Afficher "Hello"
//Sinon
// Pays non reconnu
        Scanner input=new Scanner(System.in);
        System.out.println(input);
        System.out.print("Veuillez entrer un pays : ");
        String pays=input.nextLine();


        switch (pays){
            case "France":
                System.out.println("Bonjour");
                break;
            case "Espagne":
                System.out.println("Hola");
                break;
            case "Allemagne":
                System.out.println("Guten tag");
                break;
            case "Angleterre":
                System.out.println("Hello");
                break;
            default:
                System.out.println("Pays non reconnu");
        }
    }
}
