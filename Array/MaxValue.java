package com.company.Array;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {3,67,32,5,123};

        int m= arr[0];

        for(int i=1;i< arr.length;i++){
            m=Math.max(m,arr[i]);
        }
        System.out.println(m);

    }
}
