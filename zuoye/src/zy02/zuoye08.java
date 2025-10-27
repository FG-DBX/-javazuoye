package zy02;

import java.util.Scanner;

public class zuoye08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入");
        int n=input.nextInt();
        boolean a=true;
        if (n<=1){
            a=false;
        }else {
            int i=2;
            while (i<n){
                if(n%i==0){
                    a=false;
                    break;
                }
                i++;
            }
        }
        if (a){
            System.out.println(n+"素数");
        }else {
            System.out.println(n+"不是素数");
        }
    }
}
