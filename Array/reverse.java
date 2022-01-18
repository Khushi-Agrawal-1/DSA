package com.company.Array;

import java.util.Arrays;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for( int i=0; i<5;i++){
            arr[i]= sc.nextInt();

        }

        rev(arr);
    }

    static int rev(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        //edge cases

        if(start==end){
            return -1;
        }

        for(int i=start;i<=(end)/2;i++){
            int a= arr[i];
            arr[i] = arr[end];
            arr[end]=a;
            end--;
        }
        System.out.println(Arrays.toString(arr));

        return 0;



    }
}
