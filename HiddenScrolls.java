import java.util.Scanner;
public class HiddenScrolls {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int[][] mat=new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                mat[i][j]=sc.nextInt();
        int target=sc.nextInt();
        int i=0,j=m-1,found=0;
        while(i<n && j>=0){
            if(mat[i][j]==target){found=1;break;}
            else if(mat[i][j]>target) j--;
            else i++;
        }
        System.out.println(found==1?"True":"False");
    }
}
