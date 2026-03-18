import java.util.Scanner;

class Average {
    public static void main(String[] args) {
        int a, b, c, d, e;
        System.out.println("Enter the marks of five subjects:");

        Scanner r = new Scanner(System.in);

        a = r.nextInt();
        b = r.nextInt();
        c = r.nextInt();
        d = r.nextInt();
        e = r.nextInt();

        int sum = a + b + c + d + e;
        System.out.println("Total Marks: " + sum);

        double avg = sum / 5.0;  // decimal division
        System.out.println("Average Marks: " + avg);

        r.close();  // good practice
    }
}