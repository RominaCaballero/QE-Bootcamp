package inClassExercises.session4.interfaceDemo;

public class Car implements Vehicle {
    private int year;
    private String model;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public void drive() {
        System.out.println("Car " + model + " is driving");
    }

    @Override
    public int getYear() {
        return year;
    }
}
