package streams;

import java.util.Arrays;
import java.util.Comparator;

public class StreamTriTableau {
    public static void main(String[] args){
        System.out.println("hello");

        int[] tab={10,5,14,2,3,7,2};
        //Arrays.sort(tab);
        System.out.println( "somme: "+  Arrays.stream(tab).reduce((a,b)->a+b).getAsInt()    ); //some
        System.out.println(  "avg: "+  Arrays.stream(tab).average().getAsDouble()   );
        System.out.println(  "ordered: "+ Arrays.toString( Arrays.stream(tab).sorted().toArray()  )  );
        System.out.println(  "reverse ordered: "+ Arrays.toString( Arrays.stream(tab).boxed().sorted(Comparator.reverseOrder()).toArray()  )  );

        System.out.println(  "reverse ordered limit 3: "+ Arrays.toString( Arrays.stream(tab).boxed().sorted(Comparator.reverseOrder()).limit(3).toArray() )  );


        System.out.println(Arrays.toString(tab));

        int[] numArray = {4, 3, 2, 5, 6, 7, 3, 2, 1, 9, 7, 8, 10, 6, 4, 3, 5, 8, 9};

        numArray = Arrays.stream(numArray)
                .boxed()
                //.distinct()
                //.filter(x -> x >= 5)
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(numArray));


        System.out.println("************ algo order **************");

        tab= new int[]{1,5,7,2,1,8,2};
        boolean change = false;
        do{
            change = false;
            for(int i=0;i<tab.length-1;i++) {
                if (tab[i] > tab[i + 1]) {
                    int temp = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = temp;
                    change = true;
                }
            }
        }
        while (change == true);

        System.out.println("algo tri: " + Arrays.toString(tab));


        /**********************************************************/
        // trouver l'ensemble de caractères en commun dans un ensemble de mots



        String[] table={"abced","efgab","gkfcae"};
        char[] caractereCommun= new char[table[0].length()]; int index=0;
        for(int i = 0; i<table[0].length();i++){
            char c = table[0].charAt(i);
            boolean commun = true;
            for(int j=1;j<table.length; j++){
                //if(table[j].contains(String.valueOf(c))){
                if(table[j].indexOf(c)<0){
                    commun = false;
                    break;
                }
            }
            if(commun){caractereCommun[index++]=c; }
        }

        System.out.println("caractères communs: "+ Arrays.toString(caractereCommun) +"nbr cara: "+ index);


         int v = 255;
        System.out.println("valeur v: "+v); //255
        updateTest(v); //passage par valeur
        System.out.println("valeur v updated : "+v); // 255







    }

    public static void updateTest(int a){
        a=5;
    }


}
