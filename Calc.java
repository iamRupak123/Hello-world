import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Addition  2. Subtraction  3. Multiplication  4. Division  5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Addition of two numbers is: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Subtraction of two numbers is: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Multiplication of two numbers is: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        System.out.println("Division of two numbers is: " + (num1 / num2));
                    }
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }

        sc.close();
    }
}
