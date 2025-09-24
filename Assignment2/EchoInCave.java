package Assignment2;
import java.util.*;
public class EchoInCave {
    static void printDescending(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printDescending(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1 && n <= 1000) {
            printDescending(n);
        }
        sc.close();
    }
}
