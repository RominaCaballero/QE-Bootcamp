package inClassExercises.session2.OOP;

public class Truck extends Vehicle {
    public Truck(String marca, int fuelCapacity) {
        super(marca, fuelCapacity);
    }

    @Override
    public void drive() {
        setSpeed(60);
        System.out.println("My " + getMarca() + " is going at " + getSpeed() + " km/h");
    }
}
