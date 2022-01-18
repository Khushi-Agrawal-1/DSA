package com.company.LinearSearch;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        Scanner sc = new Scanner(System.in);
        int[] arr = {3,4,5,6,7,8,9};
        int st = sc.nextInt();
        int end = sc.nextInt();
        int element= sc.nextInt();
        System.out.println(approachOne(arr,st,end,element));
        //System.out.println(approachTwo(s,element));

        long endTime = System.nanoTime() - startTime;
        System.out.println(endTime);
    }

    private static int approachOne(int[] arr, int st, int end,int element) {
        if(st==end){
            if(element==arr[st]){
                return st;
            }
        }

        if(st>end || end>= arr.length){
            return -1;
        }

        for(int i=st;i<=end;i++){
            if(element==arr[i]){
                return i;
            }
        }
        return -1;
    }

}
