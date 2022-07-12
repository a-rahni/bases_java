package fondamentaux;

import java.util.Scanner;

public class TableauInitialisation {
    public static void main(String[] args) {

        float[] notes= new float[5]; // {0.0, 0.0, 0.0, 0.0, 0.0}

        // la boucle for each:  pour lecture seule,
        for(float note:notes){
            System.out.println(note);
        }

        // saisir les notes a partir du clavier
        Scanner input = new Scanner(System.in);
        // pour modification utiliser un for simple
        for(int index=0;index<notes.length;index++){
            System.out.printf("Saisir la note %d : ", index+1);
            notes[index] = input.nextFloat();
        }

        // afficher les notes saisies
        for(float note:notes){
            System.out.println(note);
        }

    }
}
