package com.company.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/
//amazon
public class AllDuplicationNumber {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(Arrays.toString(findDuplicates(arr).toArray()));
    }
    //APPROACH -3
    public static List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {
                ans.add(arr[index]);
            }
        }

        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


// APPROACH -2
//    public static List<Integer> findDuplicates(int[] arr) {
//
//
//        // This arraylist is for storing elements which are duplicates
//        ArrayList<Integer> ansList = new ArrayList<Integer>();
//
//
//        // Sorts  the array into descending order
//        Arrays.sort(arr);
//        //O(n log n)
//
//
//        //O(n)
//        // Now iterate over the sorted array
//        for(int i=0;i<arr.length-1;i++){
//
//            if(arr[i]==arr[i+1]){
//                ansList.add(arr[i]);
//            }
//        }
//
//        return ansList;
//
//    }


//APPROACH -1 problem - printing repetetive elements if it by chance gets swapped again with the right side elements
//    public static List<Integer> findDuplicates(int[] arr) {
//        int i = 0;
//        List<Integer> list = new ArrayList<Integer>();
//        while (i < arr.length) {
//
//            if (arr[i] != i + 1) {
//                // There are only two cases when the element is at wrong position
//                // 1. its at the wrong position and needs to be swapped with its correct position
//                // 2. its at the wrong position but the correct element is already present at the index so duplicate - return
//
//                int correct = arr[i] - 1;
//                if (arr[i] != arr[correct]) {
//                    swap(arr, i , correct);
//                } else {
//                    list.add(arr[i]);
//                    i++;
//                }
//            } else {
//                i++;
//            }
//        }
//        return list;
//    }
//
//    static void swap(int[] arr, int first, int second) {
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
}
