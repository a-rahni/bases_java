package fondamentaux;

import java.util.HashMap;

public class HMapConcept {
    public static void main(String[] args) {

        // A partir d'une phrase, afficher le nombre d'occurence de chaque caractère
        //String phrase = "je suis dev";
        String phrase = "je suis dans une joie immence.Et je sais que c'est aussi le cas "+
                "pour vous";

        String phraseFormatee=phrase.replaceAll("[^A-Za-z]","").toLowerCase();
        System.out.println(phraseFormatee);

        //{j:1, e:2, ..} // HMPA consider la diff entre Maj et Min, prend tout caracter ' . espace
        // si on ne vous pas prendre en compte les . ' ... MAJ min il faut reformater le String

        // creer un HashMap: ne prend pas les type primitif (si int utilisé Integer qui est un objet)
        HashMap<Character,Integer> occurences = new HashMap<>();
        System.out.println(occurences);

        for(int index=0;index<phraseFormatee.length();index++){
            char lettre = phraseFormatee.charAt(index);
            if(occurences.containsKey(lettre)){
                int ancienneValeur= occurences.get(lettre);// auto unboxing
                occurences.replace(lettre,occurences.get(lettre)+1); // incrementer nombre d'occurences
            }else{
                occurences.put(lettre,1); // 1er occurence trouvé, donc un put
            }
        }

        System.out.println(occurences);



    }
}
