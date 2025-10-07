package Assignment3_1to15;

import java.util.Scanner;
public class LostSoldier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int xor1 = 0, xor2 = 0;
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        for(int i=0;i<n;i++) xor1 ^= arr[i];
        for(int i=0;i<=n;i++) xor2 ^= i;
        System.out.println(xor1 ^ xor2);
    }
}

