package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count=2; // we r starting the positioning with 0 instead of 1

        while(count<=n){
            int t;
            t=a;
            a=b;
            b+=t;
            count++;
        }

        System.out.println(b);

    }
}


