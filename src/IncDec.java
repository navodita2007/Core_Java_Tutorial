public class IncDec {
    public static void main(String[] args) {
        int x = 5, y;
        y = x++;  // First assignment operator will work i.e., value of y will be 5, then post increment operator will work i.e., value of x will be 6
        System.out.println(x + " " + y);
    }
}
