import java.util.Scanner;

public class LogicalOperators {
    
    public static void main(String[] args) {
        
        // && = AND
        // || = OR
        // ! = NOT

        /*
        double temp = 35;
        boolean isSunny = true;

        if(temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The weather is good!");
            System.out.println("It is sunny outside!");
        }
        
        else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("The weather is good!");
            System.out.println("It is cloudy outside!");
        }

        else if(temp > 30 || temp < 0) {
            System.out.println("The weather is bad. ");
        }

        */

        Scanner scanner = new Scanner(System.in);

        // 4-12
        // no spaces or underscore

        String username;

        System.out.println("Enter your new username: ");
        username = scanner.nextLine();

        if(username.length() < 4 | username.length() > 12) {
            System.out.println("Username must be between 4-12 characters. ");
        } 
        else if(username.contains(" ") || username.contains("_")) {
            System.out.println("Username cannot have spaces or underscores. ");
        }
        else{
            System.out.println("Welcome " + username);
        }

        scanner.close();
    }
}