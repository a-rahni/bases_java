package fondamentaux;

import java.util.*;

public class ListSetMap {

    public static void main(String[] args) {
        System.out.println("test ok");
        List<String> listC= Arrays.asList("ZB", "CD", "EF");
        List<Integer> listI= Arrays.asList(15, 4, 3,8);

        Map<String,Integer> map = new HashMap<>();
        map.put("E",69);
        map.put("A",65);
        map.put("C",66);

        listC.sort((a,b)-> {return a.compareTo(b);});
        listI.sort((a,b)->a-b);
        listC.forEach(System.out::println);
        listI.forEach(System.out::println);

        Set<String> set = map.keySet();
        Collection<Integer> list = map.values();

        for (Map.Entry e:map.entrySet()){
            System.out.println(e.getKey() + ": "+ e.getValue());

        }

        set.forEach(System.out::println);
        list.forEach(System.out::println);
    }
}
