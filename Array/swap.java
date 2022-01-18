package com.company.Array;

import java.util.Arrays;
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for( int i=0; i<5;i++){
            arr[i]= sc.nextInt();

        }

        swapit(arr,1,3);

//        for( int i=0; i<5;i++){
//            System.out.println(arr[i]);
//
//        }

        System.out.println(Arrays.toString(arr));
    }

    static void swapit(int[] arr, int i, int j) {
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }


}
