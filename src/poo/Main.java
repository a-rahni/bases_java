package poo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Objet => Instance
        Avion boeing737Max=new Avion("Boeing","737 Max 10",200,"white");
        System.out.printf("%s\n====================\n",boeing737Max.nomCompletAvion());
        System.out.printf("Marque : %s\nModèle : %s\nNombre sieges : %d\nCouleur : %s\n",
                boeing737Max.getFabricant(),
                boeing737Max.getModele(),boeing737Max.getNombreSieges(),boeing737Max.getCouleur());

        System.out.println("\n");

//        Avion a=boeing737Max; => Mauvaise car on copie la référence
//        a.setModele("XYZABC"); => désormais a et boeing737Max pointent vers un même
//        objet
//        System.out.println(boeing737Max==a);// Ceci donne true car les 2 variables
//        ont la même valeur qui est une référence vers le même objet en mémoire
        System.out.println(boeing737Max.getModele());

        Avion airbusA320=new Avion("Airbus","A320",150,"white");
        System.out.printf("%s\n====================\n",airbusA320.nomCompletAvion());
        System.out.printf("Marque : %s\nModèle : %s\nNombre sieges : %d\nCouleur : %s\n",
                airbusA320.getFabricant(),
                airbusA320.getModele(),airbusA320.getNombreSieges(),airbusA320.getCouleur());


//        Utilisation du constructeur de copie
        Avion airbusA330=new Avion(airbusA320);
        airbusA330.setModele("A330");
        System.out.println(airbusA320.getModele());
        System.out.println(airbusA330.getModele());

        System.out.println("comparer les references: airbusA330 == airbusA320: " + (airbusA320 == airbusA330)); // false :comparer les references

        // comparer des objets (contenu):
        System.out.println("comparer les attributs: airbusA330 == airbusA320: " + (airbusA320.equals(airbusA330)));

        System.out.println("\n");
        Avion monAvion=new Avion();
        System.out.printf("Marque : %s\nModèle : %s\nNombre sieges : %d\nCouleur : %s\n",
                monAvion.getFabricant(),
                monAvion.getModele(),monAvion.getNombreSieges(),monAvion.getCouleur());



        /**********************************************************************/
        // explication: methode toString
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Pomme", "Mangue","Banane"));
        HashMap<String, String> identite =new HashMap<>();
        identite.put("nom","Lisangola");
        identite.put("prenom","Christian");
        String[] noms={"Lisangola","Jean"};

        System.out.println(fruits);
        System.out.println(identite);
        System.out.println(noms);  // utiliser Arrays.toString
        //System.out.println(boeing737Max.nomCompletAvion()); // mieu de redefinir toString;
        System.out.println(boeing737Max);

    }
}

