package fondamentaux;

import java.util.Arrays;

public class FunctionsArray {

    // supposons que les deux tableaux ont la même taille
    // sinon exception (arrayIndexOfBound...) ==> gerer les exception
    static int[] produceSumArray(int[] tableauNombres1, int[] tableauNombres2) throws Exception{

        if(tableauNombres1.length != tableauNombres2.length){
            throw new Exception("les deux tableaux n'ont âs la même taille");
        }
        int taille = tableauNombres1.length;
        int[] tableauResultant = new int[taille];
        for(int i=0;i<taille;i++){
            tableauResultant[i]= tableauNombres1[i]+tableauNombres2[i];
        }
        return tableauResultant;
    }
    public static void main(String[] args) {

        int[] tb1={1,2,3,4,5};
        int[] tb2={6,7,8,9,10};
        // parceque produceSumArray genère une excpetion -> il faut la capter
        try {
            int[] tbResultant = produceSumArray(tb1,tb2);
            System.out.println(Arrays.toString(tbResultant));
        }catch (Exception err){
            System.out.println("erreur => "+ err);
        }

    }
}
