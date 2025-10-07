package Assignment3_1to15;

import java.util.Scanner;
public class MessengersPath {
    static boolean dfs(int[][] grid, int i, int j, boolean[][] visited){
        int n=grid.length, m=grid[0].length;
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]==1 || visited[i][j]) return false;
        if(i==n-1 && j==m-1) return true;
        visited[i][j]=true;
        return dfs(grid,i+1,j,visited) || dfs(grid,i-1,j,visited) || dfs(grid,i,j+1,visited) || dfs(grid,i,j-1,visited);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), m=sc.nextInt();
        int[][] grid=new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                grid[i][j]=sc.nextInt();
        boolean[][] visited=new boolean[n][m];
        System.out.println(dfs(grid,0,0,visited));
    }
}
