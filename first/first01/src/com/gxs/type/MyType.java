package com.gxs.type;

import java.util.Scanner;

/**
 * 数据类型包括 ： 基本数据类型，引用数据类型
 * 基本数据类型 ： byte short int long double float char boolean
 * 引用数据类型 ； 类（class）String  接口(interface) 数组
 * byte 1个字节 8bit（一个bit用0或者1表示）有2^8（256） 表示范围-128-127
 * short 2个字节  -2^15-2^15-1
 * int 4个字节
 * long 8个字节
 * float: 4个字节，单精度，尾数可以精确到7位有效数字。很多情况下，精度很难满足需求。用float声明后面加l或L
 * double:8个字节，双精度，精度是float的两倍。通常采用此类型。
 * char 2个字节
 * boolean: true or false
 * 基本数据类型的转换 容量小的自动转为大的（byte short char）->int->long->float->double
 *                  有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算。
 * byte,short,char之间不会相互转换，他们三者在计算时首先转换为int类型。
 * boolean类型不能与其它数据类型运算。
 * 当把任何基本数据类型的值和字符串(String)进行连接运算时(+)，基本数据类型的值将自动转化为字符串(String)类型。
 *
 * (前)++ 先自增 后运算
 * （后）++ 先运算 后自增
 * &&跟&  当&&左边是false后边不再运算
 *  |跟|| 当符合左边是false都进行运算  当左边是true时 | 会继续运算
 *
 * 变量 ：成员变量 在方法体外，类内声明。包括 实例变量（不用static修饰）和类变量（static 修饰）
 *       局部变量 在方法体内声明的变量  包括 形参（方法、构造器中定义的变量） 方法局部变量（在方法内定义） 代码块局部变量（代码块定义）
 *       两者都有生命周期 局部变量除形参外需要显示初始化
 *
 *
 *
 */
public class MyType {
    public static void main(String[] args) {
        int number01 = 10;
        int number02 = 20,number03 = 30;
        short s = 2;
        System.out.println(number01+number02-number03);
        System.out.println(number01+number02+number03);
        System.out.println(s);
   /*     Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        binaryToDecimal(i);*/
        boolean x=true;
        boolean y=false;
        short z=42;
        //if(y == true)
        if((z++==42)&&(y=true))z++;
        if((x=false) || (++z==45)) z++;

        System. out.println("z="+z);

        int a = 10;
        int b = a++;
        char c = 65;
        a = c;
        System.out.println(a+"-------");
        System.out.println(b);

        int i = 100;
        int j = 200;
        int max = i>j?i:j--;
        System.out.println(max);
        System.out.println(j);
    }
    public static void binaryToDecimal(int n){
        int t = 0;  //用来记录位数
        int bin = 0; //用来记录最后的二进制数
        int r = 0;  //用来存储余数
        while(n != 0){
            r = n % 2;
            n = n / 2;
            bin += r * Math.pow(10,t);
            t++;
        }
        System.out.println(bin);
    }

}
