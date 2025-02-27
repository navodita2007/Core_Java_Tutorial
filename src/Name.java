import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        System.out.println("May I know your Name ?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Welcome " + name);
    }
}
