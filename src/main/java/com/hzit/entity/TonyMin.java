package com.hzit.entity;

/**
 * Created by THINK on 2017/7/3.
 */
public class TonyMin {

    public  void test(String s){
        System.out.println(s);
    }

    //a = 1; b = 2;
    public  void exchange(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("交换后的a:"+a);
        System.out.println("交换后的b:"+b);
    }

    public  void exchange2(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("交换后的a:"+a);
        System.out.println("交换后的b:"+b);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 200;
        TonyMin t = new TonyMin();
        t.exchange2(a,b);
    }
}
