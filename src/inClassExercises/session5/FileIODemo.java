package inClassExercises.session5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileIODemo {
    public static void main(String[] args) {
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter("cities.txt"));
//            writer.write("Cities of the world");
//            List<String> cities = new ArrayList<String>();
//            cities.add("\nAsuncion, Paraguay");
//            cities.add("\nLondon, Paris");
//            cities.add("\nParis, France");
//            for (String city : cities) {
//                writer.write(city);
//            }
//            writer.close();
//        }catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("cities.txt"));
            reader.readLine();
            String[] cityInfo = new String[2];
            String line = reader.readLine();

            while (line != null) {
                cityInfo = line.split(",");
                System.out.println(cityInfo[0] + " is the capital of " + cityInfo[1].trim());
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error reading file" + e.getMessage());
        }
    }
}
