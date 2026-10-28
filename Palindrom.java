import java.util.Scanner;

public class Palindrom{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String rev = new StringBuilder(s).reverse().toString();

        if (s.equals(rev)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}