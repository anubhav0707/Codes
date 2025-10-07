package Assignment3_1to15;

import java.util.Scanner;
public class RoyalDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int d1 = 0, d2 = 0;
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
                if(i==j) d1+=arr[i][j];
                if(i+j==n-1) d2+=arr[i][j];
            }
        System.out.println(d1+" "+d2);
    }
}

