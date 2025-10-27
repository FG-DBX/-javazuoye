package zy01;

import java.util.Scanner;

public class zuoye05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        double max;
        if (a>=b){
            max=a;
        }else {
            max=b;
        }
        if (c>max){
            max=c;
        }
        if (d>max){
            max=d;
        }
        System.out.println("max"+max);
    }
}
