package zy01;

import java.util.Scanner;

public class zuoye08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        double c= sc.nextDouble();
        double d= sc.nextDouble();
        double  min;
        if (a<b){
            min=a;
        }else {
            min=b;
        }
        if (c<min){
            min=c;

        }
        if (d<min){
            min=d;
        }
        System.out.println("min="+min);
    }
}
