package zy02;

import java.util.Scanner;

public class zuoye03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入");
        int n=input.nextInt();
        if(n<=0){
            System.out.println("cuowu");
            return;
        }
         double s=0.0;
        for (int i = 1; i <= n; i++) {
            s+=1.0/i;
        }
        System.out.println("1+1/2+1/3+..1/"+n+"="+s);
    }
}
