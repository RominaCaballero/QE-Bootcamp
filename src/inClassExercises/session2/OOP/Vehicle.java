package inClassExercises.session2.OOP;

public abstract class Vehicle {
    private String marca;
    private int speed;
    private int fuelCapacity;

    public Vehicle(String marca, int fuelCapacity) {
        this.marca = marca;
        this.fuelCapacity = fuelCapacity;
    }

    public Vehicle(String marca) {
        this.marca = marca;
    }

    public  String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public abstract void drive();

    /*public void drive(){
        setSpeed(60);
        System.out.println("My vehicle " + marca + " is going at " + getSpeed());
    }*/
}
