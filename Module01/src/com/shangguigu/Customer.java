package com.shangguigu;


import java.util.ArrayList;

public class Customer {



    public static void main(String[] agrs) {

        System.out.printf("HelloWorld-你好世界，，hello");
        System.out.printf("\n");//换行。
        System.out.println();;//换行。
        System.out.println();
        System.out.println(Customer.sumInt());//是println不是printf
       /*
        printf主要是继承了C语言的printf的一些特性，可以进行格式化输出
        print就是一般的标准输出，但是不换行
        println和print基本没什么差别，就是最后会换行
        */

        System.out.printf("\n");//换行。

        Customer.method();

        ArrayList list = new ArrayList();
//这是单行注释。
    }

    public static void method() {
        System.out.printf("这是个方法");

    }

    public static int sumInt() {
        int a = 10;
        int y = 12;
        int x = 13;
        if (a < 3) {
            return 1;
        } else {
            return 10 > 3 ? x:y;
        }
    }
}