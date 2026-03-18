import java.util.Scanner;

public class oddEvenNumber {

    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);

        System.out.print("Enter Any Number: ");
        int n = r.nextInt();

        if (n % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        r.close();
    }
}
