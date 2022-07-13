package heritage;

public class MainHeritage {

    public static void main(String[] args){
//        var chris=new Guerrier("Christian",200,"M16 A4");
//        var bamos=new Magicien("Bamos",500,"Baguette Zozor");
//        var mamadou=new Sorcier("Mamadou",300,"BaguetteDou","BatonZor");

        Guerrier chris = new Guerrier("Christian", 200, "M16 A4");
        System.out.println(chris.getNom());
        chris.setNom("Cricri");
        System.out.println(chris.getNom());

        Magicien bamos = new Magicien("Bamos", 500, "Baguette Zozor");
        Sorcier mamadou = new Sorcier("Mamadou", 300, "BaguetteDou", "BatonZor");

        chris.rencontrer();
        bamos.rencontrer();
        mamadou.rencontrer();

        Personnage pGuerier = new Guerrier("Christian", 200, "M16 A4");
        pGuerier.rencontrer();

        System.out.println(chris);
        System.out.print("\n");
        System.out.println(bamos);
        System.out.print("\n");
        System.out.println(mamadou);


//        System.out.println(chris);
//        System.out.println(bamos);
//        System.out.println(mamadou);

    }
}
