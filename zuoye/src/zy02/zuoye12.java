package zy02;

import java.util.Scanner;

public class zuoye12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int s=1;
        System.out.println("请输入  输入-shu截至");
        do {
            System.out.println("输入");
            n=scanner.nextInt();
            if (n>=0){
                s*=n;
            }
        }while (n>=0);
        System.out.println("*是："+s);
    }
}
