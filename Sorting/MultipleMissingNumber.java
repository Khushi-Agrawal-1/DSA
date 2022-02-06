package com.company.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Google
public class MultipleMissingNumber {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(Arrays.toString(search(arr).toArray()));
    }

    private static List<Integer> search(int[] arr) {
        //  APPROACH -1
        //int i =0;
//        while(i<arr.length) {
//            boolean sameElement =false;
//            if (i+1 == arr[i]) {
//                i++;
//            } else {
//                int swapwithIndex = arr[i]-1 ; // is this the correct index of arr[i]
//                sameElement=swap(i, arr,swapwithIndex);
//            }
//            if(sameElement){
//                i++;
//            }
//
//        }

        //  APPROACH -2
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(i, arr , correct);
            } else {
                i++;
            }
        }


//        int count=0;
//        for(int a=0;a<arr.length;a++){
//            if(arr[a]!=a+1){ // if element != index+1
//                count++;
//            }
//        }
//        return count;

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {
                ans.add(index + 1);
            }
        }

        return ans;
    }
    private static boolean swap(int i, int[] arr, int swapwith) {
        if(arr[i]==arr[swapwith]){
            return true;
        }

        int temp = arr[swapwith];
        arr[swapwith] = arr[i];
        arr[i] = temp;
        return false;
    }
}
