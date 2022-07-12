package fondamentaux;

/**
 * tables de multiplication
 */

public class TP7TableMultiplication {
    public static void main(String[] args){

        for(int tab=2;tab<=10;tab++){
            System.out.println("Table de "+tab +":");
            for(int multi=1; multi<=10; multi++){
                int produit = multi*tab;
                System.out.printf("%d x %d = %d\n",multi,tab,produit);
            }
        }
    }
}
