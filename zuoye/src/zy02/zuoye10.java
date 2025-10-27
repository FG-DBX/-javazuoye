package zy02;

import java.util.Scanner;

public class zuoye10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入");
        int n=input.nextInt();
        long[] a=new long[n];
        if (n>=1){
            a[0]=0;
        }
        if (n>=2){
            a[1] = 1;
        }
        int i=2;
        while (i<n){
            a[i]=a[i-1]+a[i-2];
            i++;
        }
        int b=0;
        while (b<n){
            System.out.println(a[b]+" ");
            b++;
        }
    }
}
