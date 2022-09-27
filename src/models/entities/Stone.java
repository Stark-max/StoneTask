package models.entities;

public abstract class Stone {
    public String name;
    public double price;
    public double weight;
    public String color;
    public int transparent;

    public Stone() {
    }

    public Stone(String name, double price, double weight, String color,int transparent) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.transparent=transparent;
    }

    public int getTransparent() {
        return transparent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTransparent(int transparent) {
        this.transparent = transparent;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

