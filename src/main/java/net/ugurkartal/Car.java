package net.ugurkartal;

public class Car {
    public String brand;
    public String model;
    public String color;
    public int yearOfManufacture;

    public int speed;

    public void starts (){
        System.out.println("The car started");
    }

    public int accelerates (int speed){
        this.speed += 10;
        return this.speed;
    }
}
