/*
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        // if statement = performs block of code if statement is true

        String name;
        int age;
        boolean isStudent;

        
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        name = scanner.nextLine();

        System.out.println("What is your age? ");
        age = scanner.nextInt();

        System.out.println("Are you a student? ");
        isStudent = scanner.nextBoolean();

        // Group 1

        if(name.isEmpty()) {
            System.out.println("You didn't enter your name");
        }
        else {
            System.out.println("Hello " + name);
        }
        
        // Group 2

        if(age >= 18) {
            System.out.println("You are an adult");
        }
        // even if age > 65, itll say adult because it goes top down, so first one to be true gets printed
        // pay attention to order of statememts to make sure it works fine.
        else if(age > 65) {
            System.out.println("You are a senior");
        }
        else if(age < 0) {
            System.out.println("You haven't been born yet");
        }
        else if(age == 0) {
            System.out.println("You have been born");
        }
        else{
            System.out.println("You are not an adult");
        }

        // Group 3
        if(isStudent == true) {
            System.out.println("You are a student");
        }
        else {
            System.out.println("You rnt a student");
        }
        scanner.close();
    }
 }
    */