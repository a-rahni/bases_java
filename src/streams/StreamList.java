package streams;


//import com.sun.javafx.binding.StringFormatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Article{
private  Integer id;
private Long price;
private String name;

    public Article(Integer id, Long price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("id: %s  name: %s",id,name);
    }

    public Integer getId() {
        return id;
    }

    public Long getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}



public class StreamList {

public static List<Article> initListArticle(){
   /* List<Article> list = List.of(
            new Article(5,5000L, "Article5"),
            new Article(4,4000L, "Article4"),
            new Article(1,1000L, "Article1"),
            new Article(2,2000L, "Article2")

    );*/

    List<Article> list = new ArrayList<>(Arrays.asList(
            new Article(5,5000L, "Article5"),
            new Article(4,4000L, "Article4"),
            new Article(1,1000L, "Article1"),
            new Article(2,2000L, "Article2")

    ));
    return list;
}

    public static void main(String[] args) {

        List<Article> list = initListArticle();
        System.out.println(list);

        list.sort(Comparator.comparing(Article::getId).thenComparing(Article::getName));
        System.out.println(list);

        list.sort(Comparator.comparing(Article::getId).thenComparing(Article::getName).reversed());
        System.out.println(list);


    }

}
