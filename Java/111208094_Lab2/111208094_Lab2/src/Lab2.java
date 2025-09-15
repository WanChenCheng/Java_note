import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {

        mathOperation();
        stringOperation();
    }

    // 1. Math Operation
    private static void mathOperation() {
        System.out.println("1 - A");

        Scanner numScanner = new Scanner(System.in);

        System.out.print("Please input two numbers (use space to split): ");
        int num1 = numScanner.nextInt();
        int num2 = numScanner.nextInt();

        int gap = Math.abs(num1 - num2);
        int multiplication = num1 * num2;
        double average = (double) (num1 + num2) / 2.0;
        int minimum = Math.min(num1, num2);

        System.out.println("Gap: " + gap);
        System.out.println("Mul: " + multiplication);
        System.out.println("Avg: " + average);
        System.out.println("Min: " + minimum);

        System.out.println("1 - B");
        double rand = Math.random();
        int randomNum = (int) (rand * (gap + 1)) + minimum;
        System.out.println("Random number between " + num1 + " and " + num2 + ": " + randomNum);

        numScanner.close();
    }

    // 2. String Operation
    private static void stringOperation() {
        System.out.println("2 - String Operation");

        String fullName = "Johnny Chien";
        System.out.println(fullName);

        String firstName = fullName.substring(0, 6); // Johnny
        String lastName = fullName.substring(7);     // Chien

        System.out.println("\"" + firstName + "\"");
        System.out.println("\"" + lastName + "\"");

        System.out.println("The length of my first name \"" + firstName + "\" is " + firstName.length());
        System.out.println("The length of my last name \"" + lastName + "\" is " + lastName.length());
    }
}

