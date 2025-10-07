import java.util.Scanner;
public class UpperBoundIndex {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int target=sc.nextInt();
        int l=0,r=n-1,ans=n;
        while(l<=r){
            int m=(l+r)/2;
            if(arr[m]>target){ans=m;r=m-1;}
            else l=m+1;
        }
        System.out.println(ans);
    }
}
