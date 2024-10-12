package inClassExercises.session4.interfaceDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Vehicle peugeot = new Car ("Peugeot", 2021);

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Car("Toyota", 2002));
        vehicleList.add(new Car("Mercedes", 2023));
        vehicleList.add(new Truck(2019,"Scania",1000));
        vehicleList.add(peugeot);
        vehicleList.add(peugeot);

//        for (Vehicle vehicle : vehicleList) {
//            vehicle.drive();
//        }
//
//
//        System.out.println("--------");
//
//
//        Set<Vehicle> vehicleSet = new HashSet<>();
//        vehicleSet.add(new Car("Toyota",2002));
//        vehicleSet.add(new Truck (2019,"Scania", 1000));
//        vehicleSet.add(peugeot);
//        vehicleSet.add(peugeot);
//
//        for (Vehicle vehicle : vehicleSet) {
//            vehicle.drive();
//        }

        vehicleList.stream()
                .filter(vehicle -> vehicle.getYear() > 2020)
                .forEach(vehicle -> System.out.println(vehicle.getClass().getSimpleName() + " from " + vehicle.getYear() + " is driving"));

    }
}
