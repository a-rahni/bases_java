import java.util.Locale;
import java.util.Scanner;

public class Tp20FunctionPrefixString {
    /**
     * Ecrire une méthode Java qui prend en paramètre 2 string et qui ensuite retourne un booléen(true/false)
     * selon que le 2ème string est le préfixe du premier ou pas.
     * Ex :      * isPrefix(“banner”, “bang”)     * > false
     * isPrefix(“hugging”, “hug”)     * > true
     */

    public static boolean isPrefix(String chaine, String prefix){
        if(chaine.length() < prefix.length()){  // on peut le gerer en levant exception
            return false;
        }else{
            String subStr = chaine.substring(0,prefix.length());
            return subStr.toLowerCase().equals(prefix.toLowerCase());
            // on peut utiliser startsWith
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("chaine: ");
        String chaine = input.nextLine();
        System.out.print("prefix: ");
        String prefix = input.nextLine();

        if(isPrefix(chaine,prefix)) {
            System.out.println(prefix + " est prefixe de " + chaine);
        }else{
            System.out.println(prefix + " n'est pas prefixe de " + chaine);
        }

    }
}
