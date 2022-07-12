package fondamentaux;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Ecrire un programme Java qui remplit un tableau avec une liste des adresse email :
 * christian.lisangola@gmail.com, jean.paul@gmail.com, alain@gmail.com, lydie@yahoo.fr,
 * josephine.lajoie@yahoo.com, luise@hotmail.fr, philemon.turion@gmail.com, jules.cesar@hotmail.fr
 * Ensuite le programme va afficher en % le taux d’adresse gmail, yahoo et hotmail.
 */

public class TP19HmapStringNbrEmail {
    public static boolean isEmail(String email){
        return Pattern.matches(".+@.+\\..+", email);
    }

    public static boolean emailIsValid(String email){
        Pattern p = Pattern
                .compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}$");
        Matcher m = p.matcher(email.toUpperCase());
        return m.matches();

        //String chFormatee = email.replaceAll("[^A-Z0-9a-z]","").toUpperCase();
    }
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("*** entrez la liste des emails en un seul text :");
//        String ch1= input.nextLine();
        // split la chaine avec les separateur , et espace
        //To do

        String[] tab={"christian.lisangola@gmail.com",
                "jean.paul@gmail.com",
                "alain@gmail.com",
                "lydie@yahoo.fr",
                "josephine.lajoie@yahoo.com",
                "luise@hotmail.fr",
                "philemon.turion@gmail.com",
                "jules.cesar@hotmail.fr"
        };
        // creer hashMap cle:email server, valeur: nombre doccurences
        HashMap<String, Integer> emailMap = new HashMap<String, Integer>();
        for(int i=0;i<tab.length;i++){
            if(isEmail(tab[i])){
                String serverName = tab[i].substring(tab[i].indexOf('@'));
                if(emailMap.containsKey(serverName)){
                    emailMap.replace(serverName,emailMap.get(serverName)+1);
                }else{
                    emailMap.put(serverName,1); // premeir occurence
                }
            }
        }

        for(Map.Entry m:emailMap.entrySet()){

            float taux = (int)m.getValue()/(float)tab.length;
            System.out.printf("taux d'email %s est : %.2f \n", m.getKey(),taux);
        }
    }

}
