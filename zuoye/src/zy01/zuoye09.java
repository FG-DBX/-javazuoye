package zy01;

import java.util.Scanner;

public class zuoye09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yer=sc.nextInt();
        if ((yer%4==0&&yer%100!=0)||(yer%400==0)){
            System.out.println("是闰年");
        }else {
            System.out.println("不是闰年");
        }
    }
}
