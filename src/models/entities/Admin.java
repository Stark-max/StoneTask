package models.entities;

import java.util.List;

public class Admin {
    public double totalCaratWeight(List<Stone> stones){
        double carat = 0.0;
        for(Stone s:stones){
            carat+=s.getWeight();
        }
        return carat;
    }

    public int totalCost(List<Stone> stones){
        int cost = 0;
        for(Stone s:stones){
            cost+=s.getPrice() * s.getWeight();
        }
        return cost;
    }
}
