public class Incr {
    public static void main(String[] args) {
        int x = 5, y = 4, z;
        z = 2 * x++ + 3 * ++x;  //2*5(this is post increment hence 5 is not increased by +1 instantly) + (5+1+1)[post and pre increment]*3  = 2*5 + 3*7
        System.out.println(z);
    }
}
