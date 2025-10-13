/*
import java.util.Scanner;

public class subString {
    public static void main(String[] args) {
        // .substring() = a method used to extract a portion of a string 
        // string.substring(start, end)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your email: ");
        

        String email;
        String username;
        String domain;
        
        email = scanner.nextLine();

        if(email.contains("@")) {
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println(username);
            System.out.println(domain);
        }
        else {
            System.out.println("Emails must contain '@'. ");
        }

        

        scanner.close();
    }
}

*/
