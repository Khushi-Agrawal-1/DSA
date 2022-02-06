package com.company.Sorting;
//https://leetcode.com/problems/missing-number/
//Amazon
import java.util.Arrays;
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};

        System.out.println( search(arr));
    }
    // given range [0, n]
    // where n = arr.length
    // numbers from 0 to N -> total N+1 numbers
    // so in this index = element value
    // but what about element = N, we donot have a index N
    // so lets ignore if such a case comes
    // we know in this ques every element = index it comes on
    // so if we have a number N i.e it doesnt have a index in array so it will take the place of
    // the element which is not present in the array


    private static int search(int[] arr) {
        int i =0;
        int maxelementindex =arr.length;
        //edge case
        // eg - arr= [2,0,1] so for this n=3 so 0,1,2,3 should be present in this case we
        // need the maxelementindex = the length of array

        while(i<arr.length) {

            if (i == arr[i]) {
                i++;
            } else if (arr[i] == arr.length) {
                maxelementindex = i;
                i++;
            } else {
                swap(i, arr);
            }
        }

return maxelementindex;
        }

    private static void swap(int i, int[] arr) {
        int swapwith = arr[i] ; // is this the correct index of arr[i]
        int temp = arr[swapwith];
        arr[swapwith] = arr[i];
        arr[i] = temp;
    }
}
