import java.util.Scanner;

public class Expression1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        float s;
        double Area;

        System.out.println("Enter the 3 sides of triangle");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        s = (a + b + c) / 2f;
        //  s = (float) (a + b + c) / 2;        this is also valid

        Area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        // sqrt returns double. If it is returning as double then area should be declared as double

        System.out.println("Area of triangle is " + Area);

    }
}
