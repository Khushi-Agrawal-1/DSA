package com.company;

import java.util.Scanner;

public class Largest_no {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // to print the largest number
// approach1
//        int max = a;
//
//        if (b > max) {
//            max = b;
//        }
//
//        if (c > max) {
//            max = c;
//        }

// approach2
        int max =Math.max(a, Math.max(b,c));

        System.out.println(max);



    }
}
