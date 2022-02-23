import java.util.Scanner;

public class Printer {
    public static String SayHello() {
        return "hello";
    }
    public static void main(String[] args) {
        System.out.println(SayHello());
        System.out.println(new Scanner(System.in).nextLine());
    }
}