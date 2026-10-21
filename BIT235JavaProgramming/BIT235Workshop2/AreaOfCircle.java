import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Value of pi
        final double PI = 3.14;

        // Calculate the area using Math.pow() for radius squared
        double area = PI * Math.pow(radius, 2);

        // Display the result
        System.out.println("The area of a circle with radius " + radius + " is: " + area);

        // Close the scanner
        scanner.close();
    }
}