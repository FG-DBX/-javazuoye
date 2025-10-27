package zy02;

import java.util.Scanner;

public class zuoye05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入");
        int n=input.nextInt();
        double a=0.0;
        double b=1.0;//符号
        double c = 1.0;//分母
        for (int i = 0; i <= n; i++) {
            double d = b / c;
            a += d;
            b = -b;  //更新符号
            c *= 2;
        }
        System.out.println("序列和为"+a);
    }
}
