package inClassExercises.session3.arrayListDemo;

import java.util.Random;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int[] numbers2 = {10, 3, 33, 89, 90};

        Random random = new Random();
        int j = 0;

        for(int i = 0; i<numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
            System.out.println(numbers[i]);
        }

        System.out.println("---------");

        for (int number : numbers){
            System.out.println(number);
        }
    }
}
