package models.entities;

public class PreciousStone extends Stone{
    public PreciousStone() {
        super();
    }

    public PreciousStone(String name, double price, double weight, String color,int transparent) {
        super(name, price, weight, color,transparent);
    }

    @Override
    public String toString() {
        return "\nPreciousStone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", transparent='" + transparent +
                "}";
    }
}
