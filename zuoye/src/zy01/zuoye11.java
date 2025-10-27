package zy01;

import java.util.Scanner;

public class zuoye11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index=sc.nextInt();
        if (index >0) {
            System.out.println("正数");
        }else if(index==0){
            System.out.println("0");;
        }else {
            System.out.println("负数");
        }
    }
}
