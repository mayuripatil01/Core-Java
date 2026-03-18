import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Scanner object

        System.out.print("Enter number of terms: "); // Prompt user
        int n = sc.nextInt(); // Read input

        int a = 0, b = 1; // First two terms
        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " "); // Print current term
            int next = a + b; // Next term
            a = b; // Shift a
            b = next; // Shift b
        }

        sc.close(); // Close scanner
    }
}
