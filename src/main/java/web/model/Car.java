package web.model;

public class Car {
    private int price;
    private String color;
    private String model;

    public Car(){

    }

    public Car(int price, String color, String model) {
        this.price = price;
        this.color = color;
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
