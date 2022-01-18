package com.company;

import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int z =0;

        while(n>0){
            int a = n % 10 ;
            n=n/10;
            z = z*10+a;

        }
        System.out.println(z);
    }
}
