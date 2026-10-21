import java.util.Scanner;

public class DifferenceOfTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first integer
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second integer
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();

        System.out.print("Enter the fourth integer: ");
        int num4 = scanner.nextInt();

        // Calculate the difference
        int difference = num1 - num2 - num3 - num4;

        // Display the result
        System.out.println("The difference of " + num1 + ", " + num2 + ", " + num3
                + ", and " + num4 + " is: " + difference);

        // Close the scanner
        scanner.close();
    }
}