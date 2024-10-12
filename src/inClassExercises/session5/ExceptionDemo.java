package inClassExercises.session5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Welcome to our grade calculator " + name);

        int totalPoints = 0;
        int pointsMade = 0;
        boolean validInput = false;

        while (!validInput) {
            try{
                System.out.print("Enter the total possible points: ");
                totalPoints = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("You entered an invalid number. Please try again.");
                scanner.nextLine();
            }
        }

        validInput = false;

        while (!validInput) {
            try{
                System.out.print("Enter the points you made: ");
                pointsMade = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("You entered an invalid number. Please try again.");
                scanner.nextLine();
            }
        }

        try{
            double percentage = calculatePercentage(totalPoints, pointsMade);
            System.out.println("Your grade is " + percentage + "%");

            if (percentage >= 60){
                System.out.println("Your grade is " + percentage + "%. Congratulations you passed");
            }else {
                System.out.println("Your grade is " + percentage + "%. Sorry you failed.");
            }
        } catch (ArithmeticException e) {

            System.out.println("Error: " + e.getMessage());

        }

    }

    public static double calculatePercentage(int totalPoints, int pointsMade) throws ArithmeticException {
        if (totalPoints == 0) {
            throw new ArithmeticException("Total points must be greater than zero.");
        }

        return (double) pointsMade / totalPoints * 100;
    }
}
