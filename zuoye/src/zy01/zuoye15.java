package zy01;

import java.util.Scanner;

public class zuoye15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        double c= sc.nextDouble();

        if (a==0){
            if (b==0){
                if (c==0){
                    System.out.println("恒等式");
                }else {
                    System.out.println("无解");
                }
            }else {
                double x=-c/b;
                System.out.println(x);
            }
        }else {
            double panbie=b*b-4*a*c;
            if (panbie>0){
                double x1=(b+Math.sqrt(panbie))/(2*a);
                double x2=(b-Math.sqrt(panbie))/(2*a);
                System.out.println("两个根x1="+x1+ " x2=  "+x2);
            }else if (panbie==0){
                double x=-b/(2*a);
                System.out.println("相等跟"+x);

            }else {
                System.out.println("共轭负数");
            }
        }
    }
}
