public class Printing2 {
    public static void main(String[] args) {
        int x = 10;
        float y = 0.0012f;
        char z = 'A';
        String str = "Java Program";

        //System.out.printf("%1$d %1$d %1$d", x);  // output -> 10 10 10
        System.out.printf("%1$d %2$f %3$s %1$d %2$f %3$s", x, y, str);  // output -> 10 0.001200 Java Program 10 0.001200 Java Program
    }
}
