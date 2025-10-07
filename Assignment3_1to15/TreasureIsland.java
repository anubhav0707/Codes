package Assignment3_1to15;
import java.util.*;
public class TreasureIsland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] arr = new int[n][m];
        int max = 0, idx = 0;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=0;j<m;j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
            if(sum > max){
                max = sum;
                idx = i;
            }
        }
        System.out.println("Row " + idx + " sum " + max);
    }
}
