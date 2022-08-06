package com.gxs.type;

import java.util.Scanner;

public class Loop {

    /**
     * 求最大公约数 辗转相除法
     * @param args
     */
    public static void main(String[] args) {

        System.out.println(gcd());

    }
    public static int gcd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a = sc.nextInt();
        System.out.println("请输入第二个数");
        int b = sc.nextInt();

        while (b!=0){
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
}
