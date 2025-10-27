package zy02;


import java.util.Scanner;

public class zuoye11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int s=0;
        System.out.println("请输入  输入0截至");
        do {
            System.out.println("输入");
            n=scanner.nextInt();
            s+=n;
        }while (n!=0);
        System.out.println("总和是："+s);
    }
}
