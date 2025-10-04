
 public class Main7 {
    public static void main7(String[] args) {
        // if statement = performs block of code if statement is true

        int age = 0;

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
    }
 }