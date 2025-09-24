package Assignment2;
import java.util.*;
public class staircase {
    static int countWays(int n) {
        if (n == 0) {
            return 1; // reached top
        }
        if (n < 0) {
            return 0; // invalid step
        }
        return countWays(n - 1) + countWays(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countWays(n));
        sc.close();
    }
    }

