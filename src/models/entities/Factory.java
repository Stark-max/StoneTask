package models.entities;

import models.enums.StoneType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Factory {
    public ArrayList<StoneType> createNecklace() {
        Random random = new Random();
        ArrayList<StoneType> necklace = new ArrayList<>();
        for (int i = 0; i < random.nextInt(10) + 2; i++) {
            int pick = new Random().nextInt(StoneType.values().length);
            necklace.add(StoneType.values()[pick]);
            System.out.println(StoneType.values()[pick]);
        }
        return  necklace;
    }

    public double totalCaratWeight(List<Stone> stones) {
        double carat = 0.0;
        for (Stone s : stones) {
            carat += s.getWeight();
        }
        return carat;
    }

    public int totalCost(List<Stone> stones) {
        int cost = 0;
        for (Stone s : stones) {
            cost += s.getPrice() * s.getWeight();
        }
        return cost;
    }
}
