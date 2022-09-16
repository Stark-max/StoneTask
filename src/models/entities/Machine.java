package models.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Machine {
    public static void sortByPrice(List<Stone> stones){
        /*Collections.sort(stones, new Comparator<Stone>() {
            public int compare(Stone s1, Stone s2){return Integer.compare(s1.getPrice(), s2.getPrice());}
        });*/
        Collections.sort(stones, (s1, s2) -> Double.compare(s1.getPrice(), s2.getPrice()));
    }
    public static void sortByWeight(List<Stone> stones){
        Collections.sort(stones,(s1,s2) -> Double.compare(s1.getWeight(), s2.getWeight()));
    }
    public static List<Stone>findByColor(String color, List<Stone> stones){
        List<Stone> fs = new ArrayList<>();
        for (Stone s: stones){
            if (s.getColor().equals(color)){
                fs.add(s);
            }
        }
        return fs;
    }

    public static void sortByTransparency(List<Stone> stones) {
        Collections.sort(stones,(s1,s2) -> Integer.compare(s1.getTransparent(), s2.getTransparent()));
    }
}
