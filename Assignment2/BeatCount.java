package Assignment2;
import java.util.*;
public class BeatCount {
    static void printBeats(int current, int n) {
        if (current > n) {
            return;
        }
        System.out.print(current + " ");
        printBeats(current + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1 && n <= 1000) {
            printBeats(1, n);
        }
        sc.close();
    }
}
