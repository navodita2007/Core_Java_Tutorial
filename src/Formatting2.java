public class Formatting2 {
    public static void main(String[] args) {
        //  int a = 10;   // output -: +10
        int a = -10;   // output -: -10

        System.out.printf("%+5d", a);  // + -> this flag shows sign ( i.e., + or - ) of the number
    }
}
