import java.util.Scanner;
public class TreasureMap {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int[][] mat=new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                mat[i][j]=sc.nextInt();
        int target=sc.nextInt();
        String res="No";
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                if(mat[i][j]==target) res="Yes";
        System.out.println(res);
    }
}
