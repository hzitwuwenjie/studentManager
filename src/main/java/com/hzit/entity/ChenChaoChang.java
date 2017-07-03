package com.hzit.entity;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/3.
 */
public class ChenChaoChang {
     public void chang(){
         System.out.println("陈超嫦的GIT上传练习");
         System.out.println("修改版本");
     }
    public boolean zhishu(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public long zhishuNum(int n){
        int num=0;
        int i=0;
        int j=2;
        while(i<n){
           if(zhishu(j)){
               num=num+j;
               i++;
           }
            j++;
        }
        return num;
    }


    public static void main(String[] args) {
        ChenChaoChang c=new ChenChaoChang();
     //   System.out.println( c.zhishu(25));
        System.out.println(c.zhishuNum(4));
    }
 }
