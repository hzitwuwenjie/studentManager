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
        System.out.println("林兵刚刚修改了代码！");
        System.out.println("劉江文沒有修改代码！");
        int a = 10;
        int b = 200;
        TonyMin t = new TonyMin();
        t.exchange2(a, b);
        System.out.println("闵老师刚刚提交了代码。");
        System.out.println("汤宇航刚刚修改代码！！！");
        System.out.println("汤宇航刚刚修改代码！");
        System.out.println("梁梦楚修改了代码");
        System.out.println("毛璇提交了代码");
        System.out.println("许克兴修改了N代码");
        System.out.println("劉江文還是沒有修改代码！。。。。。。");
        System.out.println("应传富修改了代码");
        System.out.println("张武斌提交了N条代码！");
        System.out.println("曾祥炜提交了N条代码！");
        System.out.println("覃津传提交了N条代码！");
        System.out.println("应传富第二次修改代码");
        System.out.println("赖文浩第1次修改代码");
        System.out.println("舒张刚刚修改了代码");
    }
}
