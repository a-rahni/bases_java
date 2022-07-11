import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exo6Function {

    /**
     * Ecrire une méthodes qui vérifie si 2 chaines passées en paramètres sont des anagrammes.
     * @param args
     */

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

    public static String deleteSpecialChar(String chaine){
        String chFormatee = chaine.replaceAll("[^A-Za-z]","").toUpperCase();
        return chFormatee;
    }

    public static boolean areAnagrammes(String ch1, String ch2){

        //String ch1F=deleteSpecialChar(ch1);
        //System.out.println("chaine1 formatee: "+ ch1F);
        //String ch2F=deleteSpecialChar(ch2);
        //System.out.println("chaine2 formatee: "+ ch2F);

        HashMap<Character,Integer> occurenceCh1 = ComputeNbrOccurences(ch1);//new HashMap<>();
        HashMap<Character,Integer> occurenceCh2 = ComputeNbrOccurences(ch2); //new HashMap<>();

        boolean areAnagrammes=true;
        for (Map.Entry m : occurenceCh1.entrySet()) {
            char lettre = (Character) m.getKey();
            if(!occurenceCh2.containsKey(lettre) || (m.getValue() != occurenceCh2.get(lettre))){
                areAnagrammes = false;
                break;
            }
        }
        return areAnagrammes;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("*** test chaines anagrammes");
        System.out.printf(" chaine 1: ");
        String ch1= input.nextLine();

        System.out.printf(" chaine 2: ");
        String ch2= input.nextLine();

        String ch1F=deleteSpecialChar(ch1);
        //System.out.println("chaine1 formatee: "+ ch1F);
        String ch2F=deleteSpecialChar(ch2);
        //System.out.println("chaine2 formatee: "+ ch2F);

        boolean areAnagrammes= areAnagrammes(ch1F,ch2F);
        if(areAnagrammes){
            System.out.println(" les deux chaines sont anagrammes");
        }else{
            System.out.println(" les deux chaines ne sont pas anagrammes");
        }


    }


}



// autre methode
//public class FunctionAnagramme {
//    static HashMap<Character, Integer> createCharMapping(String word) {
//        String phraseWord = word.replaceAll("[^A-Za-z]", "").toLowerCase();
//        HashMap<Character, Integer> occurences = new HashMap<>();
//
//        for (int index = 0; index < phraseWord.length(); index++) {
//            char lettre = phraseWord.charAt(index);
//            if (occurences.containsKey(lettre)) {
//                int ancienneValeur = occurences.get(lettre);
//                occurences.replace(lettre, ancienneValeur + 1);
//            } else {
//                occurences.put(lettre, 1);
//            }
//
//        }
//        return occurences;
//    }
//
//    static Boolean isAnagramme(String word, String word2) {
//        return createCharMapping(word).equals(createCharMapping(word2));
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Veuillez entrer un mot : ");
//        String word = input.nextLine();
//        System.out.print("Veuillez entrer second mot : ");
//        String word2 = input.nextLine();
//
//        Boolean result = isAnagramme(word, word2);
//        if (result) {
//            System.out.println(word + " est un anagramme de " + word2);
//        } else {
//            System.out.println(word + " n'est pas un anagramme de " + word2);
//        }
//
//
//    }
//}
