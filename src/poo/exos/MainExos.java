package poo.exos;

import java.util.Scanner;

public class MainExos {
    public static void main(String[] args) {

        /**  Exo souris  */

        Souris s1 = new Souris(50,"blanche",2);
        Souris s2 = new Souris(45,"grise");
        Souris s3 = new Souris(s2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

//        s1.vieillir();
//        s2.vieillir();
//        s3.vieillir();
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);

        s1.evolue();
        s2.evolue();
        s3.evolue();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        /** Exo Patient */
//        Patient p=new Patient("braque","georges",60f, 1.70f);
//        System.out.println(p);
//        System.out.printf("poids: %.2fKg  taille: %.2fm\n",p.getPoids(),p.getTaille());
//        p.setPoids(p.getPoids()+2);
//        System.out.println(p);




        /** Exo rectangle  */
//        Rectangle r1 = new Rectangle();
//        float aire = r1.getAire();
//        float perimetre = r1.getPerimetre();
//        System.out.printf(" aire: %.2f  perimetre: %.2f \n", aire,perimetre );
//
//        r1.setLargeur(5.5f);
//        r1.setLongueur(2.0f);
//        aire = r1.getAire();
//        perimetre = r1.getPerimetre();
//        System.out.printf(" aire: %.2f  perimetre: %.2f \n", aire,perimetre );


        /**    Exo Personne            */
//        Scanner input = new Scanner(System.in);
//        Personne p = new Personne();
//        System.out.print("prenom: ");
//        String prenom = input.next();
//        p.setPrenom(prenom);
//
//        System.out.print("nom: ");
//        String nom = input.next();
//        p.setNom(nom);
//
//        System.out.print("est Celibataire (1:célibataire/0:Marié): ");
//        int celibataire = input.nextInt();
//        p.setCelibataire((celibataire==0?false:true));
//
//        //boolean b = input.nextBoolean() ; // True ou False
//
//        // lorsqu'on melange input.nextInt, next next line, println pour consommer le reste
//
//        System.out.print("nombre enfants: ");
//        int nbrEnfants = input.nextInt();
//        p.setNombreEnfants(nbrEnfants);
//
//        System.out.println(p.nomComplet());
        /** ******************************************************** */
    }
}
