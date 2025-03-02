public class Arithmetic3 {
    public static void main(String[] args) {
        float a = 12.5f;
        long b = 1231l; // int b = 123;  this is also valid

        // long c=a*b;   this will give error because result is in floating point, so we should write float datatype
        float c = a * b; // if we multiply float with int the result is float .it is valid because larger datatype is float.
        System.out.println(c);
    }
}
