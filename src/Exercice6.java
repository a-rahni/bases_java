import java.util.Scanner;

public class Exercice6 {
    public static void main(String[] args) {
        // ax2+bx+c = 0.
        //L’utilisateur devra fournir a,b,c à partir du clavier, ensuite le programme lui donnera la solution
        //Principe du fonctionnement d’une équation du 2nd degré:
        // https://www.maths-et-tiques.fr/telech/Secondegre2ESL.pdf

        Scanner input = new Scanner(System.in);

        System.out.print(" Entrez la valeur de a: ");
        float a = input.nextFloat();

        System.out.print(" Entrez la valeur de b: ");
        float b = input.nextFloat();

        System.out.print(" Entrez la valeur de c: ");
        float c = input.nextFloat();

        if(a == 0){
            System.out.println(" la valeur de 'a' doit être differente de zero");
        } else{
            // le discriminant de l'equation
            double delta = Math.pow(b,2)- (4*a*c);

            System.out.println("le discriminant delta = "+ delta);

            if (delta < 0) {
                System.out.println("l'equation n'a pas de solution");
            }else if(delta == 0){
                double x0 = (-b)/(2*a);
                System.out.println("l'équation a une unique solution x0 = "+x0);
            }else{
                double x1 = ((-b)-Math.sqrt(delta))/(2*a);
                double x2 = ((-b)+Math.sqrt(delta))/(2*a);

                System.out.println("l'équation a deux solutions distinct x1 = "+x1 +" x2: "+x2);
            }
        }

    }
}

//double x1 x2;
//if (delta < 0) {
//        System.out.println("l'equation n'a pas de solution");
//        }else {
//        double x1 = ((-b)-Math.sqrt(delta))/(2*a);
//        double x2 = ((-b)+Math.sqrt(delta))/(2*a);
//
//        System.out.println("l'équation a deux solutions distinct x1 = "+x1 +" x2: "+x2);
//        }