import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        RectangleArea Rectangle = new RectangleArea();
        Rectangle.downloadData(2, 5);
        Rectangle.calculationField();
        Rectangle.displayFields();

        Car Bmw = new Car("Bmw", "e46", 2012, 30000.30, "Black", 2);
        System.out.println(Bmw.toString());
        Bmw.delivery();
        System.out.println(Bmw.toString());
        Bmw.sell();
        System.out.println(Bmw.toString());
        System.out.println(Bmw.getBrand());
        Bmw.setBrand("Audi");
        Bmw.setModel("A3");
        System.out.println(Bmw.toString());

    }
}

class RectangleArea {
    int a;
    int b;
    int volume;

    public RectangleArea() {
    }

    public RectangleArea(int a, int b) {
        this.a = a;
        this.b = b;
        volume = a * b;
    }

    public void downloadData(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void calculationField() {
        volume = a * b;
    }

    public void displayFields() {
        System.out.println(a + " * " + b + " = " + volume);
    }

}

class Car {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;

    public Car(String model, String brand, int year, double price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    public String getModel() {
        return this.model;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getYear() {
        return this.year;
    }

    public double getPrice() {
        return this.price;
    }

    public String getColor() {
        return this.color;
    }

    public int getQuantity() {
        return this.quantity;
    }

    ///set
    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void delivery() {
        this.quantity++;
    }

    public void sell() {
        if (this.quantity > 0) {
            this.quantity--;
        }
    }

    public String toString() {
        return ("Model: " + this.model + " Brand: " + this.brand + " Year: " + this.year + " Price: " + this.price + " Color: " + this.color + " Quantity: " + this.quantity);
    }

}



