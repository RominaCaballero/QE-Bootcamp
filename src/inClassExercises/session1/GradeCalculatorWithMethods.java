package inClassExercises.session1;

import java.util.Scanner;

public class GradeCalculatorWithMethods {
    public static void main(String[] args) {
//        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        System.out.println("Welcome to our grade  calculator " + name + "!");

        System.out.println("Ingrese el nombre:");
        String name = scanner.nextLine();
        System.out.println("Hola, " + name);
        System.out.println("Enter the total of the possible points: ");
        int totalPoints = scanner.nextInt();

        System.out.println("Enter the total points you made: ");
        int pointsMade = scanner.nextInt();

        double percentage = (double) pointsMade / totalPoints * 100;

        if(percentage >= 60){
            System.out.println("Your percentage is " + percentage + "%. You passed!");
        } else System.out.println("Your percentage is " + percentage + "%. You FAILED!");

//        int grade = (int) (percentage / 10);

        char grade = calculateGrade(percentage);
        System.out.println("Your grade is " + grade);


/*
        switch (grade){
            case 10:
                System.out.println("Congratulations you excelled! You got and A!");
                break;
            case 9:
                System.out.println("Congratulations! You got and A!");
                break;
            case 8:
                System.out.println("Congratulations! You got and B!");
                break;
            case 7:
                System.out.println("Congratulations! You got and C!");
                break;
            case 6:
                System.out.println("Congratulations! You got and D!");
                break;
            default:
                System.out.println("Oh no! You got and F!");


        }*/
    }
    public static char calculateGrade(double percentage){
        int gradeNum = (int) percentage / 10;

        return switch (gradeNum){
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'F';

        };
    }
}
