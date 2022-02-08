package com.company.Sorting;

import java.util.Arrays;

public class MissingPositive {
    public static void main(String[] args) {
        int[] arr = {7,8,9,11,12};
        System.out.println(firstMissingPositive(arr));
    }

// approach -2

    public static int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }

        // case 2
        return arr.length + 1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

// approach -1 -> problem when input isnt from 1 to n eg ->[7,8,9,11,12]
//    public static int firstMissingPositive(int[] nums) {
//        int i=0;
//        while(i<nums.length){
//            int correct = nums[i] - 1;
//            if(correct>-1 && nums[i]!=nums[correct]){
//                swap(nums, i , correct);
//            }else {
//                i++;
//            }
//        }
//
//        for(int j=0;j< nums.length;j++){
//            if(nums[j]!=j+1){
//                return j+1;
//            }
//        }
//        return nums.length+1;
//    }
//
//    private static void swap(int[] arr, int i, int correct) {
//        int temp = arr[correct];
//        arr[correct]=arr[i];
//        arr[i]=temp;
//    }

}
