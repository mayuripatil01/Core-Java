import java.util.Scanner;
public class Vote {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter Your Age:");
        Scanner r = new Scanner (System.in);

        age =r.nextInt();
        if(age>=18)
        {
            System.out.println("You Are Eligible");
        }
        else{
            System.out.println("You Are Not Eligible");
        }
        r.close();

    }
    
}
