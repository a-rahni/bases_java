import java.util.HashMap;
import java.util.Scanner;

/**
 * Ecrire un programme Java qui remplit un tableau avec une liste des adresse email :
 * christian.lisangola@gmail.com, jean.paul@gmail.com, alain@gmail.com, lydie@yahoo.fr,
 * josephine.lajoie@yahoo.com, luise@hotmail.fr, philemon.turion@gmail.com, jules.cesar@hotmail.fr
 * Ensuite le programme va afficher en % le taux d’adresse gmail, yahoo et hotmail.
 */

public class TP19HmapStringNbrEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("*** entrez la liste des emails en un seul text :");
        String ch1= input.nextLine();

        // split la chaine avec les separateur , et espace
        //To do


    }

    public static HashMap<Character,Integer> ComputeNbrOccurences(String chaine){

        HashMap<Character,Integer> occurences = new HashMap<>();
        for(int index=0;index<chaine.length();index++){
            char lettre = chaine.charAt(index);
            if(occurences.containsKey(lettre)){
                occurences.replace(lettre,occurences.get(lettre)+1);
            }else{
                occurences.put(lettre,1);
            }
        }
        return occurences;
    }
}
