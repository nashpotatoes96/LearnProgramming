import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {

        readUserInput();
    }

    public static void readUserInput() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 10 integers: ");

        int validCount = 0;
        int sum = 0;
        while (validCount < 10) {
            System.out.println("Enter number #" + (validCount + 1) + ":");
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                validCount++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }

        scanner.close();
        System.out.println("The sum of those 10 integers was: " + sum);
    }

}
