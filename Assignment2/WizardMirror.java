package Assignment2;
import java.util.Scanner;
public class WizardMirror {
    static String reverseString(String s) {
        if (s.isEmpty()) {
            return s;
        }
        return reverseString(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.length() >= 1 && s.length() <= 100) {
            System.out.println(reverseString(s));
        }
        sc.close();
    }
}
