package fondamentaux;

/**
 * Ecrire une méthode Java qui prend en paramètre un tableau 2D, et un nombre.
 * La méthode devra nous retourner la valeur corresponde au nombre de fois que ce nombre se
 * trouve dans le tableau et ses différentes positions.
 * Ex :
 * maMethode({
 *   {1, 4, 2, 1},
 *   {6, 3, 8, 9},
 *   {1, 5, 1, 0}
 * },1)
 * > 1 se retrouve 4 fois dans les emplacements suivants : (0,0),(0,3),(2,0),(2,2)
 */

public class Tp21FunctionTab2D {

//    public static int computeNbrOccurences(int[][] tab, int nbr){
//        int nbrOccurence = 0;
//        for (int i=0; i< tab.length; i++){
//            for (int j =0; j<tab[i].length; j++)
//            {
//                if(tab[i][j] == nbr){
//                    nbrOccurence++;
//                }
//            }
//        }
//        return nbrOccurence;
//    }

//    public static void afficherPositionNbr(int[][] tab, int nbr){
//        for (int i=0; i< tab.length; i++){
//            for (int j =0; j<tab[i].length; j++)
//            {
//                if(tab[i][j] == nbr){
//                    System.out.printf("( %d,%d),",i,j);
//                }
//            }
//        }
//    }

    public static String afficherPositionNbr(int[][] tab, int nbr){
        int nbrOccurence = 0;
        String positions = "";
        for (int i=0; i< tab.length; i++){
            for (int j =0; j<tab[i].length; j++)
            {
                if(tab[i][j] == nbr){
                    nbrOccurence++;
                    positions += ("("+i+","+j+"),");
                }
            }
        }
        return (nbr + "se trouve "+nbrOccurence+" fois dans les emplacemets suivants:"+positions);
    }

    public static void main(String[] args) {

        int[][] tab ={
                {1,4,2,1},
                {6,3,8,9},
                {1,5,1,0}
        };
        int nbr = 1;
        System.out.println(afficherPositionNbr(tab,nbr));

    }
}
