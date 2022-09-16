import models.entities.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        Necklace necklace = new Necklace();
        List<Stone> s = new ArrayList<>();
        Stone stone1 = new PreciousStone("Pearls",794.20,4.138,"Red",4);
        Stone stone2 = new SemiPreciousStone("Opal",570.56,1.441,"White","Iridescence",3);
        Stone stone3 = new SemiPreciousStone("Turquoise",655.38,3.265,"Black","Opalescence",4);
        Stone stone4 = new SemiPreciousStone("Opal",570.56,1.138,"White","Tiger_Eye",3);
        Stone stone5 = new PreciousStone("Diamond",311.86,3.830,"Red",1);
        s.add(stone1);
        s.add(stone2);
        s.add(stone3);
        s.add(stone4);
        s.add(stone5);
        necklace.setStones(s);
        System.out.println(necklace);
        System.out.println("Total carat weight: " + admin.totalCaratWeight(necklace.getStones()));
        System.out.println("Total stones cost: " + admin.totalCost(necklace.getStones()));
        Machine.sortByPrice(necklace.getStones());
        System.out.println("Stones sorted: " + necklace.getStones());
        Machine.sortByTransparency(necklace.getStones());
        System.out.println("Sort by transparency: "+necklace.getStones());
    }
}