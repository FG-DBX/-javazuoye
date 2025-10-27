package zy02;

import java.util.Scanner;

public class zuoye15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c1 =0;
        int c2 =0;
        int n;
        System.out.println("请输入（0结束）");
        do {
            System.out.println("请输入");
            n=input.nextInt();
            if (n>0){
              c1++;
            }else if(n<0) {
                c2++;
            }
        }while (n!=0);
        System.out.println("正个数"+c1);
        System.out.println("负个数"+c2);
    }
}
