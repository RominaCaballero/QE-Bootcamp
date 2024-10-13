package inClassExercises.session2.OOP;

public class Main {
    public static void main(String[] args) {

        Vehicle myCar = new Car("Toyota", 120);
        myCar.drive();

        Vehicle myTruck = new Truck("Peugeot", 200);
        myTruck.drive();

        //myVehicle.setMarca("Toyota");
        //myVehicle.setFuelCapacity(120);

    }
}
