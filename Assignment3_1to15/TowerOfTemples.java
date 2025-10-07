package Assignment3_1to15;

import java.util.Scanner;
public class TowerOfTemples {
    static int hanoi(int n, char src, char dest, char aux){
        if(n==1) return 1;
        return hanoi(n-1,src,aux,dest)+1+hanoi(n-1,aux,dest,src);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(hanoi(n,'A','C','B'));
    }
}
