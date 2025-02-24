import java.util.Scanner;

// This code will read an integer and then display an integer
public class SumOfTwoNumbers {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int x, y, z;
        x = sc.nextInt();
        y = sc.nextInt();
        z = x + y;
        System.out.println("Sum of two number is :" + " " + z);

    }

}
