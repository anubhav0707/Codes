import java.util.Scanner;
public class FloorValue {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int target=sc.nextInt(), ans=-1;
        for(int i=n-1;i>=0;i--) if(arr[i]<=target){ans=arr[i];break;}
        System.out.println(ans);
    }
}
