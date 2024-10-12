/*Create a program that returns the monthly payment of a lease.
The program should accept 4 inputs in the beginning - total leased money, down payment, lease term(in months), and interest rate.
You can use the following equation
((totalLeasedMoney - downPayment) + ((totalLeasedMoney - downPayment) * (interestRate / 100))) / monthsLeaseTerm.
Print the monthly payment that is calculated.
 */

import java.util.Scanner; // Import Scanner class for input

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a scanner object

        // Input total leased money
        System.out.println("Please enter total leased money");
        double totalLeasedMoney = scanner.nextDouble();

        // Input down payment
        System.out.println("Please enter the down payment");
        double downPayment = scanner.nextDouble();

        // Input lease term in months(number)
        System.out.println("Please enter the lease term in month number");
        int monthsLeaseTerm = scanner.nextInt();

        // Input interest rate
        System.out.println("Please enter the interest rate");
        double interestRate = scanner.nextDouble();

        scanner.close();

        // Calculate the monthly payment
        double calculatedPayment = ((totalLeasedMoney - downPayment) + ((totalLeasedMoney - downPayment) * (interestRate / 100))) / monthsLeaseTerm;

        // Print the result
        System.out.println("The total monthly payment is $" + calculatedPayment);
    }
}
