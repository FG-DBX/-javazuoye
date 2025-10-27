package zy02;

import java.util.Scanner;

public class zouye02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入");
        int n=input.nextInt();
        long a=1;
        for (int i = 1; i <=n; i++) {
            a*=i;
        }
        System.out.println(n+"i="+a);
    }
}
