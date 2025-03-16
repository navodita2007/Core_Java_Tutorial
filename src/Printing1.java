public class Printing1 {
    public static void main(String[] args) {
        int x = 10;

        //float y = 12.56f;
        float y = 125.6f;
        //float y = 0.0012f;
        char z = 'A';
        String str = "Java Program";
        // System.out.printf("Hello %x %f %c World\n", x, y, z);
        System.out.printf("Hello %x %e %c %s World\n", x, y, z, str);  // output : Hello a 1.256000e+02 A Java Program World

    }
}
// Format specifiers :-    %d -> for integer , %f -> fpr float , %c -> for character , %x -> for hexadecimal