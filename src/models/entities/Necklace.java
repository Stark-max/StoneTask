package models.entities;

import models.enums.StoneType;

import java.util.ArrayList;
import java.util.List;

public class Necklace {
    private List<Stone> stones =new ArrayList<>();

    public Necklace() {
    }

    public  List<Stone> getStones() {
        return stones;
    }

    public void setStones(List<Stone> stones) {
        this.stones = stones;
    }

    @Override
    public String toString() {
        return "Necklace{" +
                "stones=" + stones +
                '}';
    }
    public void addStone(){
        Factory factory= new Factory();
        ArrayList<StoneType> first = new ArrayList<>();
        first=factory.createNecklace();
        for(StoneType type:first){
            if(type.getPleochroism()!=null){
                SemiPreciousStone stone = new SemiPreciousStone();
                stone.setName(type.name());
                stone.setWeight(type.getWeight());
                stone.setPrice(type.getPrice());
                stone.setColor(type.getColor());
                stone.setPleochroism(type.getPleochroism());
                stone.setTransparent(type.getTransparency());
                stones.add(stone);
            } else /*if (type.getPleochroism()==null)*/ {
                PreciousStone stone = new PreciousStone();
                stone.setName(type.name());
                stone.setColor(type.getColor());
                stone.setPrice(type.getPrice());
                stone.setTransparent(type.getTransparency());
                stone.setWeight(type.getWeight());
                stones.add(stone);
            }
        }
        Factory admin = new Factory();

        /*Stone stone1 = new PreciousStone("Pearls",794.20,4.138,"Red",4);
        Stone stone2 = new SemiPreciousStone("Opal",570.56,1.441,"White","Iridescence",3);
        Stone stone3 = new SemiPreciousStone("Turquoise",655.38,3.265,"Black","Opalescence",4);
        Stone stone4 = new SemiPreciousStone("Opal",570.56,1.138,"White","Tiger_Eye",3);
        Stone stone5 = new PreciousStone("Diamond",311.86,3.830,"Red",1);
        stones.add(stone1);
        stones.add(stone2);
        stones.add(stone3);
        stones.add(stone4);
        stones.add(stone5);*/
        System.out.println(stones);
        System.out.println("Total carat weight: " + admin.totalCaratWeight(stones));
        System.out.println("Total stones cost: " + admin.totalCost(stones));
        Machine.sortByPrice(stones);
        System.out.println("Stones sorted by price: " + stones);
        Machine.sortByTransparency(stones);
        System.out.println("Sort by transparency: "+stones);
    }
}
