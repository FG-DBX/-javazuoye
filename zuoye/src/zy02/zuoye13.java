package zy02;

import java.util.Scanner;

public class zuoye13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int s=0;
        int c=0;
        System.out.println("请输入  输入0截至");
        do {
            System.out.println("输入");
            n=scanner.nextInt();
            if (n!=0){
                s+=n;
                c++;
            }

        }while (n!=0);
        if (c>0){
            double ave=(double) s/c;
            System.out.println("算术平均值："+ave);
        }else {
            System.out.println("wu");
        }

    }
}
