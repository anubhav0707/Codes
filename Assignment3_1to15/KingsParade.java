package Assignment3_1to15;

import java.util.Scanner;
public class KingsParade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        boolean sorted = true;
        for(int i=1;i<n;i++) if(arr[i]<arr[i-1]) sorted = false;
        System.out.println(sorted);
    }
}

