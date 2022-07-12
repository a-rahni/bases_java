package fondamentaux;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorEmail {

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

        public static boolean isLength (String str,int min,int max){
            return str.length()>=min && str.length()<=max;
        }

        public static boolean isEmpty(String str){
            return str.length()==0;
        }

}
