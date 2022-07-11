import java.util.Scanner;

/**
 * Recherche de caractères identiques dans une rangée
 * On vous donne une chaîne de caractères d’un seul mot comme argument. Vous retournerez true si elle
 * contient deux caractères identiques dans une rangée,c’est-à-dire qui se suivent, sinon elle retournera false.
 * Exigences
 * Doit retourner true ou false
 * Doit également fonctionner avec les caractères spéciaux
 * Exemple n° 1 maMethode(“terrific”) > true
 * Exemple n°2  maMethode(“chats”) > false
 * Exemple n°3  maMethode(“chats !!“) > true
 */



public class Tp22StringCaraIdentique {

    public static boolean containTwoCharIdentique(String mot){

        for(int i=0;i<mot.length()-1;i++){
            if(mot.charAt(i) == mot.charAt(i+1)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(" Mot: ");
        String mot = input.next();
        System.out.println(mot + " contient deux char identiques -> "+ containTwoCharIdentique(mot));

    }
}
