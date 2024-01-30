package net.ugurkartal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.starts();

        Car car2 = new Car();
        car2.accelerates(50);
        System.out.println(car2.speed);

        car2.accelerates(30);
        System.out.println(car2.speed);

        Person person = new Person("Ugur",37, "mann");
        System.out.printf("Hello, I am %s and %d years old.", person.name, person.age);
    }
}