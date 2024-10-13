package inClassExercises.session2.OOP;

public class Car extends Vehicle {
    public Car(String marca, int fuelCapacity) {
        super(marca, fuelCapacity);
    }

    @Override
    public void drive() {
        setSpeed(100);
        System.out.println("My " + getMarca() + " is going at " + getSpeed() + " km/h");
    }
}
