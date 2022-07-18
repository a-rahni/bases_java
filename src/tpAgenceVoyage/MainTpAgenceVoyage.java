package tpAgenceVoyage;

public class MainTpAgenceVoyage {
    public static void main(String[] args) {

        KitVoyage kitParisLondre = new KitVoyage("Paris","Londre");

        kitParisLondre.ajouterOption(new Sejour("Hotel1",50,5,150));
        kitParisLondre.ajouterOption(new Transport("Vol2514",15,false));

        System.out.println(kitParisLondre);


    }
}
