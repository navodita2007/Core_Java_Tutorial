public class Arithmetic6 {
    public static void main(String[] args) {
        System.out.println(10 / (2 * 5));
    }
}
//  Arithmetic operators -:  +  -  *  /  %
//      Arithmetic operators( + - * / ) can be applied on any types of data like int, float, double, char but except boolean. While using % for floating point numbers
//      like x = 12.7 % 3.1 dont take decimal point in quotient  3.1)12.7(4
//                                                                    12.4
//                                                                    -------
//                                                                     0.3
//     Then you will get remainder in floating point

//       * , / , % -> all three have higher (and equal) precedence. They are executed from left to right if all three have occured together.
//      + , - -? These two have lower precedence.
//      use brackets (), if you want to give higher precedence to + and -
