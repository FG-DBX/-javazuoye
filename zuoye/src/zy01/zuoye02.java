package zy01;

import java.util.Scanner;

public class zuoye02 {
    public static void main(String[] args) {
        //三个整数求最小值

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int min;
        if (num1<num2){
            min=num1;
        }else {
            min=num2;
        }
        if (min>num3){
            min=num3;
        }
        System.out.println("min="+min);

//        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入");
//        int num1=sc.nextInt();
//        int num2=sc.nextInt();
//        int num3=sc.nextInt();
//        int temp=num1<num2 ? num1: num2;
//        int min=temp <num3 ? temp: num3;
//        System.out.println("min:"+min);
    }
}
