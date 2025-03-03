import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        float area, base, height;
        System.out.println("Enter Base and Height ");
        Scanner sc = new Scanner(System.in);

        base = sc.nextFloat();
        height = sc.nextFloat();

        //  area = (1 / 2) * base * height;  output of this will be zero because
        //   Integer division truncates (removes) the decimal part and keeps only the whole number.
        //   Since 1 / 2 is 0.5, Java drops everything after the decimal and keeps 0.
        area = (1f / 2f) * base * height;
        System.out.println("user entered base : " + base + " and height : " + height);
        System.out.println("Area of a triangle is " + area);

        // area = base * height / 2;   this is also applicable.
    }
}
