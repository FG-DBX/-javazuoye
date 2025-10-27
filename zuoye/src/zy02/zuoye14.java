package zy02;

import java.util.Scanner;

public class zuoye14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c=0;
        int n;
        System.out.println("请输入（正数结束）");
        do {
            System.out.println("请输入");
            n=input.nextInt();
            if (n<=0){
                c++;
            }
        }while (n<=0);
        System.out.println("个数"+c);
    }
}
