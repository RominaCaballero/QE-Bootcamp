package homeworkExercises;/* A company, MentorMarkers Corp., wants to keep a record of an employee.
The record must have the following characteristics and the values should be received by user input:
First Name
Last Name
Age (0..100)
Employee Number (27560000…27569999)
Print all of the employee characteristics as well with an additional one for email
the email should be generated based on the first name and last name (john.smith@mentormakers.com e.g.)
 */

import java.util.Scanner;  // Import Scanner class for input

public class TaskOne {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner scanner = new Scanner(System.in);

        // Get user's first name
        System.out.println("Please enter your first name");
        String firstName = scanner.nextLine();

        // Get user's last name
        System.out.println("Please enter your last name");
        String lastName = scanner.nextLine();

        // Get user's age and validate it
        System.out.println("Please enter your age");
        int age = scanner.nextInt();

        while (age > 100 || age < 0) { // Check if age is valid and ask again if invalid
            System.out.println("Please enter a valid age between 0 and 100");
            age = scanner.nextInt();
        }

        // Get user's employee number and validate it
        System.out.println("Please enter your employee number");
        int employeeNumber = scanner.nextInt();

        while (employeeNumber > 27569999 || employeeNumber < 27560000) { // Check if employee number is valid and ask again if invalid
            System.out.println("Please enter a valid employee number");
            employeeNumber = scanner.nextInt();
        }

        scanner.close();

        // Generate the email
        String email = firstName + "." + lastName + "@mentormakers.com";

        // Print all the employee details
        System.out.println("\n--- Employee Record! ---");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Employee Number: " + employeeNumber);
        System.out.println("Email: " + email);
    }
}
