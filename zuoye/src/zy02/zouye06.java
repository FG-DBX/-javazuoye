package zy02;

import java.util.Scanner;

public class zouye06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入");
        int n=input.nextInt();
        if (n==0){
            System.out.println("0");
            return;
        }
        int a=0;
       while (n > 0){
           a+=n%10;
           n/=10;
       }
        System.out.println(n+"各位数字之和为："+a);

    }
}
