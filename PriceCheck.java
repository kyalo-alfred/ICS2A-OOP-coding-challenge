import java.util.Scanner;

public class PriceCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter the price: ");
        int price = scanner.nextInt();  // Read user input

        if (price < 25) {
            System.out.println("I'll buy!");
        } else {
            System.out.println("Too Expensive");
        }

        scanner.close();  // Close the scanner
    }
}
