package zy01;

import java.util.Scanner;

public class zuoye01 {
    public static void main(String[] args) {
        //三个整数求最大值
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int max;
        if (num1>num2){
            max=num1;
        }else {
            max=num2;
        }
        if (max<num3){
            max=num3;
        }
        System.out.println("max="+max);

//        int num1=sc.nextInt();
//        int num2=sc.nextInt();
//        int num3=sc.nextInt();
//        int temp=num1>num2 ? num1: num2;
//        int max=temp >num3 ? temp: num3;
//        System.out.println("max:"+max);

    }
}


