package models.entities;

public class SemiPreciousStone extends Stone{
    public String Pleochroism;

    public SemiPreciousStone() {
        super();
    }

    public SemiPreciousStone(String name, double price, double weight, String color, String pleochroism,int transparent) {
        super(name, price, weight, color,transparent);
        Pleochroism = pleochroism;
    }

    public String getPleochroism() {
        return Pleochroism;
    }

    public void setPleochroism(String pleochroism) {
        Pleochroism = pleochroism;
    }

    @Override
    public String toString() {
        return "\nSemiPreciousStone{" +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                "Pleochroism='" + Pleochroism + '\'' +
                ", transparent='" + transparent +
                "}";
    }
}
