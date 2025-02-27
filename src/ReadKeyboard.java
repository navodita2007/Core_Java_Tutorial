import java.util.Scanner;

public class ReadKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in is an object attached to keyboard
        sc.useRadix(2); // here 2 means binary form, so read the input in binary form.
        int x = sc.nextInt(); // nextInt() method will read an integer i.e., decimal form. Similarly nextFloat() method will read a float
        // float x = sc.nextFloat();
        // String x = sc.next();
        // String x = sc.nextLine();
        System.out.println(x); // System.out is an object attached to monitor, println() is a method which will print and move the cursor to next line
    }
}
