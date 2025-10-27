package zy01;

import java.util.Scanner;

public class zuoye13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入圆的半径");
        double re=sc.nextDouble();
        if (re>=0){
            double area=Math.PI*re*re;
            System.out.println("面积:"+area);
        }else {
            System.out.println("错误：不能为负数");
        }
        sc.close();
    }
}
