package Assignment2;
import java.util.*;
public class KingsTreasury {
    static int sumOfCoins(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumOfCoins(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1 && n <= 10000) {
            System.out.println(sumOfCoins(n));
        }
        sc.close();
    }
}
