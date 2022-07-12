package fondamentaux;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Exercices {

    public static void main(String[] args){

//     Ecrire un programme Java qui demande à l’utilisateur de saisir la valeur du diamètre,
//     et qui ensuite va effectuer le calcul de la surface.
        Scanner input = new Scanner(System.in);

        System.out.printf("saisir le Diamètre : ");
        float diametre = input.nextFloat();

        float rayon = diametre/ (float)2;
        double surface = Math.pow(rayon,2)* Math.PI;

        System.out.println("rayon : "+rayon);
        System.out.println("surface : "+surface);

        // exercice 2:
//        Ecrire un programme Java qui déclare 3 variables, a,b,c et
//        qui va ensuite effectuer une permutation de ces valeurs :
        System.out.println("**** Exercice 2 ******");

        System.out.printf("entrez la première valeur(a): ");
        int a = input.nextInt();

        System.out.printf("entrez la première valeur(b): ");
        int b = input.nextInt();

        System.out.printf("entrez la première valeur(c): ");
        int c = input.nextInt();

        int v1 = b;
        b = a;
        int v2 = c;
        c = v1;
        a = v2;

        System.out.printf("les valeurs permutées sont: a= %d, b= %d, c= %d \n", a,b,c);

//      exercice 3
//      deduire l'année de naissance a partir de l'age
        System.out.println("**** Exercice 3 ******");

        System.out.printf("entrez votre age: ");
        int age = input.nextInt();
        //int anneeNaissance = 2022-age;
        int anneeNaissance2 = LocalDateTime.now().getYear()-age;
        System.out.println("Votre année de naissance est: "+ anneeNaissance2);



//      exercice 4
//      calcul polynome ((a+b)/2)x3 + (a+b)2x2 + a + b + c
        System.out.println("**** Exercice 4 ******");

        System.out.printf("entrez a: ");
        int a1 = input.nextInt();

        System.out.printf("entrez b: ");
        int b1 = input.nextInt();

        System.out.printf("entrez c: ");
        int c1 = input.nextInt();

        System.out.printf("entrez x: ");
        double x = input.nextDouble();

        double resultat = (Math.pow(x,3)*((double)(a1+b1)/(double)2)) + (Math.pow(x,2)* Math.pow((a1+b1),2)) + a1 + b1 + c1;
        System.out.println("La valeur du polynôme est : "+ resultat);

    }
}
