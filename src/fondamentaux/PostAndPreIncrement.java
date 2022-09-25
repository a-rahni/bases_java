package fondamentaux;

public class PostAndPreIncrement {
    public static void main(String[] args){
        int a=2;

        // Post incrementation
        // 1 : On affect à b l'ancienne valeur de a(2)
        // 2 : Comme l'increment est faite à droite, la valeur de a va incrémenter 1.
        // 3 : Donc a vaudra 3, et b vaudra 2
        int b=a++;
        System.out.println("a : "+a);//3
        System.out.println("b : "+b);//2


        // Pre incrementation
        // 1 : Comme l'increment est faite à gauche, la valeur de x va
        // d'abord incrémenter 1.

        // 2 : On affect à y la nouvele valeur de x(4) après son incrémentation
        // 3 : Donc x vaudra 4, et y vaudra 4
        int x=3;
        int y=++x;
        System.out.println("x : "+x);//4
        System.out.println("y : "+y);//4


//        Exemple
        int c=2;
        c=c++;
        System.out.println(c); // 2

        c=++c;
        System.out.println(c); // 3

        System.out.println(++c); // 4

        System.out.println(c++); // 4

    }
}
