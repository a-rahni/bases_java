package poo;

public class Main {
    public static void main(String[] args) {
        // Objet => Instance
        Avion boeing737Max=new Avion();
        boeing737Max.setFabricant("Boeing");
        boeing737Max.setModele("737 Max 10");
        boeing737Max.setNombreSieges(200);
        boeing737Max.setCouleur("white");
        System.out.printf("%s\n====================\n",boeing737Max.nomCompletAvion());
        System.out.printf("Marque : %s\nModèle : %s\nNombre sieges : %d\nCouleur : %s\n",
                boeing737Max.getFabricant(),
                boeing737Max.getModele(),boeing737Max.getNombreSieges(),boeing737Max.getCouleur());

        System.out.println("\n");

        Avion airbusA320=new Avion();
        airbusA320.setFabricant("Airbus");
        airbusA320.setModele("A320");
        airbusA320.setNombreSieges(150);
        airbusA320.setCouleur("white");
        System.out.printf("%s\n====================\n",airbusA320.nomCompletAvion());
        System.out.printf("Marque : %s\nModèle : %s\nNombre sieges : %d\nCouleur : %s\n",
                airbusA320.getFabricant(),
                airbusA320.getModele(),airbusA320.getNombreSieges(),airbusA320.getCouleur());

        System.out.println("\n");
        Avion monAvion=new Avion();
        System.out.printf("Marque : %s\nModèle : %s\nNombre sieges : %d\nCouleur : %s\n",
                monAvion.getFabricant(),
                monAvion.getModele(),monAvion.getNombreSieges(),monAvion.getCouleur());
    }
}
