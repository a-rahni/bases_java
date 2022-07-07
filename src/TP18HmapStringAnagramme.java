import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Ecrire un programme Java demande à l’utilisateur de saisir 2 chaines de caractères et qui
 * ensuite renseigne si ce sont des anagrammes.
 * Qu’est-ce qu’une anagramme ?
 * Une anagramme est un mot ou un groupe de mots obtenu en changeant de place les lettres d’un autre
 * mot ou groupe de mots.
 * Par exemple, “GARE” est une anagramme de “RAGE”, ou “GARE MAMAN” est une anagramme de “ANAGRAMME”.
 */

public class TP18HmapStringAnagramme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("*** test chaines anagrammes");
        System.out.printf(" chaine 1: ");
        String ch1= input.nextLine();

        System.out.printf(" chaine 2: ");
        String ch2= input.nextLine();

        String ch1F=ch1.replaceAll("[^A-Za-z]","").toUpperCase();
        System.out.println("chaine1 formatee: "+ ch1F);
        String ch2F=ch2.replaceAll("[^A-Za-z]","").toUpperCase();
        System.out.println("chaine2 formatee: "+ ch2F);

        HashMap<Character,Integer> occurenceCh1 = ComputeNbrOccurences(ch1F);//new HashMap<>();
        HashMap<Character,Integer> occurenceCh2 = ComputeNbrOccurences(ch2F); //new HashMap<>();

        boolean areAnagrammes=true;
        for (Map.Entry m : occurenceCh1.entrySet()) {
            char lettre = (Character) m.getKey();
            if(!occurenceCh2.containsKey(lettre) || (m.getValue() != occurenceCh2.get(lettre))){
                areAnagrammes = false;
                break;
            }
        }

        if(areAnagrammes){
            System.out.println(" les deux chaines sont anagrammes");
        }else{
            System.out.println(" les deux chaines ne sont pas anagrammes");
        }

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
