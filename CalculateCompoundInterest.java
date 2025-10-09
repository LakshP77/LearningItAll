/*
import java.util.Scanner;

public class CalculateCompoundInterest {
    public static void main(String[] args) { 

        // Compound Interest Calculator
        Scanner scanner = new Scanner(System.in);

        double principle;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principle amount: ");
        principle = scanner.nextDouble();

        System.out.print("Enter the interest rate(in decimal form): ");
        rate = scanner.nextDouble();

        System.out.print("Enter the amount of times compounded yearly: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number it has been in the account: ");
        years = scanner.nextInt();

        amount = principle * Math.pow(1 + rate / timesCompounded , timesCompounded * years);

        System.out.println("The amount after " + years + " is: $ " + amount + " .");


        scanner.close();
    }
}

*/