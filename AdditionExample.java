import java.util.Scanner;

public class AdditionExample{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Adding the numbers
        int sum = num1 + num2;

        // Displaying the result
        System.out.println("Sum = " + sum);

        scanner.close();
    }
}
