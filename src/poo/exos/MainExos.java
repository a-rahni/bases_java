package poo.exos;

import java.util.Scanner;

public class MainExos {
    public static void main(String[] args) {
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

        Scanner input = new Scanner(System.in);
        Personne p = new Personne();
        System.out.print("prenom: ");
        String prenom = input.next();
        p.setPrenom(prenom);

        System.out.print("nom: ");
        String nom = input.next();
        p.setNom(nom);

        System.out.print("est Celibataire (1:célibataire/0:Marié): ");
        int celibataire = input.nextInt();
        p.setCelibataire((celibataire==0?false:true));

        //boolean b = input.nextBoolean() ; // True ou False

        // lorsqu'on melange input.nextInt, next next line, println pour consommer le reste

        System.out.print("nombre enfants: ");
        int nbrEnfants = input.nextInt();
        p.setNombreEnfants(nbrEnfants);

        System.out.println(p.nomComplet());

    }
}
