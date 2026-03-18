import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n, i, fact = 1;
        System.out.println("Enter Any Number");
        Scanner r = new Scanner(System.in);

        n = r.nextInt();
        for(i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial: " + fact);

        r.close(); // Good practice
    }
}
