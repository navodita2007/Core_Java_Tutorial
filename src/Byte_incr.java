public class Byte_incr {
    public static void main(String[] args) {
        byte b = 7;
        // b = b + 1; //  Concept : b is byte type variable but 1 is an integer literal. If integer literal is added with byte or short or int then result will be integer only.
        b++;
        //Concept : When we perform arithmetic operations (like  b + 1 ) on byte, short and int then result will be int only. So we can't assign the integer value ( b + 1 -> integer ) to b variable which is byte datatype. So, we can't say b=b+1, but we can say b++
        // If we write b++ ,this is byte type data, it will modify the same data, so this is byte type only. When we perform increment/decrement it is performed on variable itself.
        // b = b + 1 will give an error.  But b++; is correct
        System.out.println(b);
    }
}
