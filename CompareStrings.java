import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        boolean stringsAreEqual = firstString.equals(secondString);

        System.out.println("The two given strings are equal: " + stringsAreEqual);

        if (firstString.isEmpty() || secondString.isEmpty()) {
            System.out.println("The first characters cannot be compared because "
                    + "at least one string is empty.");
        } else {
            char firstCharacter = firstString.charAt(0);
            char secondCharacter = secondString.charAt(0);
            boolean firstCharactersAreEqual = firstCharacter == secondCharacter;

            System.out.println("First character of the first string: "
                    + firstCharacter);
            System.out.println("First character of the second string: "
                    + secondCharacter);
            System.out.println("The first characters are equal: "
                    + firstCharactersAreEqual);
        }

        scanner.close();
    }
}
