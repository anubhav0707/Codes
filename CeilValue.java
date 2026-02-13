import java.util.Scanner;
public class CeilValue {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int target=sc.nextInt(), ans=-1;
        for(int i=0;i<n;i++) if(arr[i]>=target){ans=arr[i];break;}
        System.out.println(ans);
    }
}

