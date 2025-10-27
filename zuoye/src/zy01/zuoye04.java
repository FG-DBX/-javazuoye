package zy01;

import java.util.Scanner;

public class zuoye04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        double x=sc.nextDouble();
        double result;
        if (x >= 0) {
            result=x;
        }else {
            result=-x;
        }
        System.out.println("绝对值"+x+"="+result);
    }
}
