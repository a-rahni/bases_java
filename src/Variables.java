public class Variables {
    public static void main(String[] args){
        int longueur = 200;
        int largeur = 50;

        int perimetre = 2*(longueur + largeur); // affectation de la valeur de l'expression
        int surface = longueur * largeur;

        System.out.println("perimetre: "+perimetre);
        System.out.println("surface: "+ surface);
    }
}
