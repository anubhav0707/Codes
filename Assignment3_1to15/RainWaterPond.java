package Assignment3_1to15;

import java.util.Scanner;
public class RainWaterPond {
    static void dfs(int[][] grid, int i, int j){
        int n=grid.length, m=grid[0].length;
        if(i<0||j<0||i>=n||j>=m||grid[i][j]!=1) return;
        grid[i][j]=2;
        dfs(grid,i+1,j); dfs(grid,i-1,j); dfs(grid,i,j+1); dfs(grid,i,j-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int[][] grid=new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                grid[i][j]=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                if(grid[i][j]==1){
                    dfs(grid,i,j);
                    count++;
                }
        System.out.println(count);
    }
}

