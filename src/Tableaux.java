public class Tableaux {
    public static void main(String[] args) {
        //Etudiant s'appelle Jean
        String g;
        float note1=15.5F;
        float note2=18.2F;
        float note3=13.2F;
        float note4=10;
        float note5=14.6F;

        //Calculer la somme
        float sommeNotes=note1+note2+note3+note4+note5;
        //Calculer la moyenne
        float moyenne=sommeNotes/5;
        System.out.printf("Somme : %.2f\n",sommeNotes);
        System.out.printf("Moyenne : %.2f",moyenne);

        // Les notes c'est pour un étudiant
        // Stocker les notes de l'étudiant dans une seule collection
    }
}
