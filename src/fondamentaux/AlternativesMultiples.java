package fondamentaux;

import java.util.Scanner;

public class AlternativesMultiples {
    public static void main(String[] args){
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
        System.out.print("Veuillez entrer un pays : ");
        String pays=input.nextLine();

        // comparaison des String == (compare les references et pas les valeur) car String est un objet
        if(pays.equals("France")){
            System.out.println("Bonjour");
        }else if(pays.equals("Espagne")){
            System.out.println("Hola");
        }else if(pays.equals("Allemagne")){
            System.out.println("Guten tag");
        }else if(pays.equals("Angleterre")){
            System.out.println("Hello");
        }else{
            System.out.println("Pays non reconnu");
        }
    }
}
