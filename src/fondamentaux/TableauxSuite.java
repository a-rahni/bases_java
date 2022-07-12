package fondamentaux;

public class TableauxSuite {
    public static void main(String[] args) {
        float[] notes={15.5F,18.2F,13.2F,10,14.6F};

//        Mauvaise pour l'affichage
//        System.out.println(notes[0]);
//        System.out.println(notes[1]);
//        System.out.println(notes[2]);
//        System.out.println(notes[3]);
//        System.out.println(notes[4]);

//        Bonne approche pour l'affichage
        for(int index=0;index<notes.length;index++){
            System.out.println(notes[index]);
        }

        //        Calcul de la somme
        float sommeNotes=0;
        for(int index=0;index<notes.length;index++){
            // index = 0 : sommeNotes = 0 + 15.5 = 15.5
            // index = 1 : sommeNotes = 15.5 + 18.2 = 33.7
            // index = 2 : sommeNotes = 33.7 + 13.2 = 46.9
            // index = 3 : sommeNotes = 46.9 + 10 = 56.9
            // index = 4 : sommeNotes = 56.9 + 14.6 = 71.5
            // index = 5 : 5<notes.length(5) : Faux
            sommeNotes=sommeNotes+notes[index];
        }
        System.out.println("Somme notes : "+sommeNotes);
        System.out.println("La moyenne : "+sommeNotes/notes.length);
        
    }
}
