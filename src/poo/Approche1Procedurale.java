package poo;

import java.util.ArrayList;

public class Approche1Procedurale {
    static double calculPerimetre(double longueur, double largeur){
        return 2*(longueur+largeur);
    }

    static double calculAire(double longueur,double largeur){
        return longueur*largeur;
    }

    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Orange");
        System.out.println(fruits.isEmpty());
        double longueur=200.5;
        double largeur=50.5;
        double masse=45;

        System.out.println("Surface : "+calculAire(masse,largeur));
        System.out.println("Perimètre : "+calculPerimetre(longueur,largeur));
    }
}
