import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int secondNumber = scanner.nextInt();

        int difference = firstNumber - secondNumber;
        System.out.println("The difference is: " + difference);

        scanner.close();
    }
}
