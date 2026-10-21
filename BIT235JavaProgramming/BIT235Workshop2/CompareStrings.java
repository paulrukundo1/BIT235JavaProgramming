import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Compare the two strings using equals()
        boolean stringsEqual = str1.equals(str2);

        // Compare the first characters of each string
        boolean firstCharsEqual = str1.charAt(0) == str2.charAt(0);

        // Display the results
        System.out.println();
        System.out.println("The two given strings are equal: " + stringsEqual);
        System.out.println("The first characters are equal  : " + firstCharsEqual);
        System.out.println("First character of string 1     : " + str1.charAt(0));
        System.out.println("First character of string 2     : " + str2.charAt(0));

        // Close the scanner
        scanner.close();
    }
}