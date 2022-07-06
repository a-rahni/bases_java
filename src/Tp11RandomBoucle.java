import java.util.Random;
import java.util.Scanner;


/**Écrire un programme Java qui génère un nombre(entier) aléatoire entre 1 et 100 et qui ensuite demandera
 à l’utilisateur de deviner le nombre jusqu’à ce que la réponse convienne.
 En cas de réponse supérieure à la valeur générée, le programme affichera “Entrer un plus petit nombre”.
 En cas de valeur inférieur, le programme affichera “Entrer un plus grand nombre”.
*/

public class Tp11RandomBoucle {
    public static void main(String[] args) {

        int borneInf = 1;
        int borneSup = 100;
        Random random = new Random();
        int nb;
        nb = borneInf+random.nextInt(borneSup-borneInf);

        //int randomNumber = (int) (Math.random() * (99 - 1) + 1);


        System.out.println(nb);

        Scanner input = new Scanner(System.in);
        int readNb =0;
        while(true){
            System.out.print(" \nDeviner le nombre généré: ");
            readNb = input.nextInt();

            if(readNb == nb){
                System.out.printf("\n *** BRAVO !");
                break;
            }

            if(readNb>nb){
                System.out.printf("\nEntrer un nombre plus petit");
            }else {
                System.out.printf("\nEntrer un nombre plus grand");
            }

        }
    }
}
