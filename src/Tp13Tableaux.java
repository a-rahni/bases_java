import java.util.Arrays;
import java.util.Scanner;

public class Tp13Tableaux {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] t1 ={2,6,8,15,39,11};
        int[] t2 = {21,33,12,19,0};
        int[] t3 ={17,18,46};

        int[][] tabMultiD= {t1,t2,t3};


        for (int i=0;i<tabMultiD.length;i++){
            System.out.printf("T%d:", i+1);
            System.out.println(Arrays.toString(tabMultiD[i]));
        }

        int somme = 0;
        System.out.print("S = ");
        for(int[] t:tabMultiD){
            for(int e:t){
                if((e%3 == 0) && (e/3>0) ){
                    somme+=e;
                    System.out.printf("%d+",e);
                }
            }
        }
        System.out.printf(" = %d", somme);
    }
}
