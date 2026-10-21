import java.util.Scanner;

public class Compare2strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        boolean stringsEqual = firstString.equals(secondString);
        System.out.println("The two given strings are equal: " + stringsEqual);

        if (!firstString.isEmpty() && !secondString.isEmpty()) {
            boolean firstCharactersEqual =
                    firstString.charAt(0) == secondString.charAt(0);
            System.out.println("The first characters are equal: " + firstCharactersEqual);
        } else {
            System.out.println("Cannot compare first characters because at least one string is empty.");
        }

        scanner.close();
    }
}
