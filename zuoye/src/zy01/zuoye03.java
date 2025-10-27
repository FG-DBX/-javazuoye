package zy01;

import java.util.Scanner;

public class zuoye03 {
        public static void main(String[] args) {
                //求解ax+b=0
                Scanner sc=new Scanner(System.in);
                System.out.println("请输入");

                        double a = sc.nextDouble();
                        double b = sc.nextDouble();
                        double x = -b / a;
                        if (a!=0){
                                System.out.println("x=:"+x);
                        }else {
                                System.out.println("a不能为0");
                        }

        }
        }
