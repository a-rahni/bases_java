import java.util.Arrays;

public class FunctionsArray {

    //
    static int[] produceSumArray(int[] tableauNombres1, int[] tableauNombres2){
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
        int[] tbResultant = produceSumArray(tb1,tb2);
        System.out.println(Arrays.toString(tbResultant));

    }
}
