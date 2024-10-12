package inClassExercises.session3.arrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Shamuel");
        students.add("Karen");
        students.add("José");

        for (String student : students) {
            System.out.println(student);
        }

        System.out.println("----------");
        students.set(0, "Roni");
        students.add("Chiara");
        students.remove("Karen");

        for (String student : students) {
            System.out.println(student);
        }
    }
}
