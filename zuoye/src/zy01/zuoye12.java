package zy01;

import java.util.Scanner;

public class zuoye12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b = sc.nextInt();
        if (a>=0&&b>=0){
            System.out.println("第一象限");
        }else if(a<=0&&b>=0){
            System.out.println("第二象限");
        }else if(a<=0&&b<=0){
            System.out.println("第三象限");
        }else {
            System.out.println("第四象限");
        }
    }
}
