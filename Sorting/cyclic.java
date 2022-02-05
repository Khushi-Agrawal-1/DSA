package com.company.Sorting;

import java.util.Arrays;

public class cyclic {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3};
//        search(arr);
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // APPROACH - 1
    private static void search(int[] arr) {
        int i = 0;
        while (i < arr.length - 1) {  // where n-1 is the index of last element

            if (arr[i] == i + 1) {
                i++;
            } else {
                swapp(i,arr);
            }

        }
    }

    private static void swapp(int i,int[] arr) {
        int swapwith = arr[i] -1; // is this the correct index of arr[i]
        int temp = arr[swapwith];
        arr[swapwith] = arr[i];
        arr[i] = temp;

    }

    // APPROACH - 2

    static void sort(int[] arr) {
        int i = 0;
        // whats the need to do it till arr.length we can just do it till arr.length-1 because we have an input of 1 to N numbers then obviously the moment the array is sorted till second last element its a fully sorted array
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}