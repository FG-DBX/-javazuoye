package zy01;

import java.util.Scanner;

public class zuoye07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        double a= sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println(a+"x+"+b+"<0");
        if (a>0){
            double nu=-b/a;
            System.out.println("x>"+nu);
        }else if(a<0){
            double nu2=-b / a;
            System.out.println("x<"+nu2);
        }else {
            if(b<0){
                System.out.println("所有实数");
            }else if (b>0){
                System.out.println("无解");
            }else {
                System.out.println("无解");
            }
        }
    }
}
