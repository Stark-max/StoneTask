package models.entities;

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
}
