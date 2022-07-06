import java.util.Scanner;

/**
 Ecrivez un programme qui affiche en console les nombres de 1 à n:
pour les multiples de trois, il affiche “fizz” à la place du nombre
et pour les multiples de cinq de cinq, imprimez “buzz”.
Pour les nombres qui sont des multiples multiples à la fois de trois et de cinq, imprimez “fizzbuzz”.
Sinon, il affiche le nombre
 */

public class Tp12FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" Entrez un nombre: ");
        int nb= input.nextInt();

        for(int i=1; i<=nb; i++){
            String prop="";
            if(i%3 == 0) prop+="fizz";
            if(i%5 == 0) prop+="buzz";
            if(prop.equals("")){
                System.out.println(i);
            }else{
                System.out.println(prop);
            }
        }
    }
}
