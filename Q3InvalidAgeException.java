package Task7;

import java.util.Scanner;

// Custom exception class for invalid age
class InvalidAgeExcetion extends Exception{
    public InvalidAgeExcetion() {
        super("Error: Age must be 18 or higher.");
    }
}

public class Q3InvalidAgeException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            validateAge(age);
            System.out.println("Age validation successful!");
        } catch (InvalidAgeExcetion e) {
            System.out.println(e.getMessage()); 
        }

        scanner.close();
    }

    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeExcetion {
        if (age < 18) {
            throw new InvalidAgeExcetion();
        }
    }
}