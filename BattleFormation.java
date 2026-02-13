import java.util.Scanner;
public class BattleFormation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), m=sc.nextInt();
        int[][] mat=new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                mat[i][j]=sc.nextInt();
        int target=sc.nextInt();
        int l=0,r=n*m-1,found=0;
        while(l<=r){
            int mid=(l+r)/2;
            int val=mat[mid/m][mid%m];
            if(val==target){found=1;break;}
            if(val<target)l=mid+1;
            else r=mid-1;
        }
        System.out.println(found==1?"True":"False");
    }
}

