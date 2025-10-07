/*
// for user input, scanner is required
import java.util.Scanner;

public class Main2 {
    public static void main2(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        // to read integers use nextInt
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        // use scanner.nextLine(); by itself to take care of any issues with text coming after a #
        scanner.nextLine();

        System.out.println("Whats your favorite color?: ");
        String color = scanner.nextLine();
       


        // for decimals, use nextDouble
        System.out.println("What is your gpa? ");
        double gpa = scanner.nextDouble();

        System.out.println("Are you a student?(t/f) ");
        boolean isStudent = scanner.nextBoolean();


        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println(" Your favorite color is " + color); 
        System.out.println("Your gpa is " + gpa);
        // System.out.println("Student: " + isStudent);
        if (isStudent) {
            System.out.println("You are a student");
        }
        else {
            System.out.println("You are NOT a student");
        }

        scanner.close();
    }
}

*/
