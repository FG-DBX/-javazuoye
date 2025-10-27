package zy02;

import java.util.Scanner;

public class zuoye04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入");
        int n=input.nextInt();
        long a=1;
        for (int i = 1; i <= n; i++) {
            if (i%2!=0){
                a*=i;
            }
        }
        System.out.println("1到"+n+"奇数乘积："+a);
    }
}
