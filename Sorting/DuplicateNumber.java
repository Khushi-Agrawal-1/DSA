package com.company.Sorting;
//https://leetcode.com/problems/find-the-duplicate-number/
//amazon
public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(search(arr));
    }

   private static int search(int[] arr) {
       // APPROACH - 1
//        int i = 0;
//        while (i < arr.length) {
//            int correct = arr[i] - 1;
//            if (arr[i] != arr[correct]) {
//                swap(i, arr , correct);
//            } else {
//                i++;
//            }
//        }
//
//        for(int j=0;j< arr.length;j++){
//            if(arr[j]!=j+1){
//                return arr[j];
//            }
//        }
//        return -1;

       int i = 0;
       while (i < arr.length) {

           if (arr[i] != i + 1) {
               int correct = arr[i] - 1;
               if (arr[i] != arr[correct]) {
                   swap(i,arr,correct);
               } else {
                   return arr[i];
               }
           } else {
               i++;
           }
       }
       return -1;

 }
//
    private static void swap(int i, int[] arr, int correct) {
        int temp = arr[correct];
        arr[correct]=arr[i];
        arr[i]=temp;
    }



}

