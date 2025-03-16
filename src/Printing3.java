public class Printing3 {
    public static void main(String[] args) {
        int x = 10;
        float y = 0.0012f;
        char z = 'A';
        String str = "Java Program";

        //System.out.printf("%1$d %1$d %1$d", x);  // output -> 10 10 10
        System.out.printf("%3$s %2$f %1$d", x, y, str);  // here order is different still code is executing.output -> Java Program 0.001200 10
    }
}


