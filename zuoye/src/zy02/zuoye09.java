package zy02;

import java.util.Scanner;

public class zuoye09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入");
        int n=input.nextInt();
        int s=input.nextInt();
        boolean a=true;
        if (n<=0||s<=0){
            a=false;
        }else {
            int te1=n;
            int te2=s;
            while (te2!=0) {
                int te=te2;
                te2=te1%te2;
                te1=te;
}
            a=(te1==1);
        }
        if (a){
            System.out.println("互质");
        }else {
            System.out.println("不互质");
        }
    }
}
