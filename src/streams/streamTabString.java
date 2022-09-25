package streams;

import java.util.Arrays;
import java.util.Comparator;

public class streamTabString {
    public static void main(String[] args) {

        //String[] myArray = {"one", "two", "three", "four"};
        String[] myArray = {"azaa", "afz", "abzzzz", "caaa"};
        //Arrays.sort(myArray, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(myArray));

        // ordre inversé
       // Arrays.sort(myArray, Comparator.reverseOrder());
       // System.out.println(Arrays.toString(myArray));

        // stream
        System.out.println(Arrays.toString(  Arrays.stream(myArray).sorted().toArray()) );
        System.out.println("tab orig:" + Arrays.toString(myArray));

        // stream
        System.out.println(Arrays.toString(  Arrays.stream(myArray).sorted(Comparator.reverseOrder()).toArray() ) );
        System.out.println("tab orig:" + Arrays.toString(myArray));

        // order par length
        System.out.println(Arrays.toString(  Arrays.stream(myArray).sorted(Comparator.comparing(String::length)   ).toArray() ) );
        //System.out.println("tab orig:" + Arrays.toString(myArray));
        // order par length  inversé
        System.out.println(Arrays.toString(  Arrays.stream(myArray).sorted(Comparator.comparing(String::length).reversed()   ).toArray() ) );
        System.out.println("tab orig:" + Arrays.toString(myArray));

        // order par length
        System.out.println(Arrays.toString(  Arrays.stream(myArray).sorted((e1,e2)->e1.length()-e2.length()).toArray() ) );

    }
}
