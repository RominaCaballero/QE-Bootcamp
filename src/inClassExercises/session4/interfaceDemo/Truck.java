package inClassExercises.session4.interfaceDemo;

public class Truck implements Vehicle {
    private int year;
    private String model;
    private int Loadcapacity;

    public Truck(int year, String model, int Loadcapacity) {
        this.year = year;
        this.model = model;
        this.Loadcapacity = Loadcapacity;
    }

    @Override
    public void drive() {
        System.out.println("Truck " + model + " is driving");
    }

    @Override
    public int getYear() {
        return year;
    }

    public int getLoadcapacity() {
        return Loadcapacity;
    }
}
