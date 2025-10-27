package zy02;

import java.util.Scanner;

public class zuoye07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入");
        int n=input.nextInt();
        int a=0;
        int c=n;
        if (c==0){
            a=1;
        }else{
            while (c > 0) {
                a++;
                c=c/10;
            }
        }
        System.out.println(n+"位数是"+a);
    }
}
