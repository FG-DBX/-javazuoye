package zy02;

import java.util.Scanner;

public class zuoye01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入");
        int n=input.nextInt();
        int a=0;
        for (int i = 2; i <= n; i+=2) {
            a+=i;
        }
        System.out.println("偶数之和："+a);
    }
}
