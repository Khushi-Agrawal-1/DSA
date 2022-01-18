package com.company;

import java.util.Arrays;

public class Variable_legth_argument {
    public static void main(String[] args) {
        fun(4,32,42,1,3);
        sec(2,"hy");
    }
    static void fun(int ...x){
        System.out.println(Arrays.toString(x));
    }
    static void sec(int a,String ...y){
        System.out.println(Arrays.toString(y));
    }
}
