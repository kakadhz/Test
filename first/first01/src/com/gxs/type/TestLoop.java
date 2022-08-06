package com.gxs.type;

import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class TestLoop {
    public static void main(String[] args) {
      /*  //输入整数n计算n的阶乘
        *//*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = 1;
        for (int i = 1; i <= n; i++) {
            b = b * i;
        }
        System.out.println(b);*//*
        int a = 10;
        int b = a;
        a = 11;
        System.out.println(a);
        System.out.println(b);
        String str = "hello";
        String str1 = str;
        str = "nihao";
        System.out.println(str);
        System.out.println(str1);
        List list = new ArrayList<>();*/

        int a = 2;
        switch (a){
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("world");
                break;
        }
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
    }
}
