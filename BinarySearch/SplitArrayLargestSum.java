package com.company.BinarySearch;

// https://leetcode.com/problems/split-array-largest-sum/
public class SplitArrayLargestSum {
    public static void main(String[] args) {
        // continous elements-> minimize the largest sum among these m subarrays.
        // divide array into m parts
        // find the possible sums of all parts - take largest sum
        // from all the possibilities of m subarrays and the largest sum we got from
        // each one - take the smallest sum
        //
        int[] arr = { 5, 1, 3 };
        int target = 1;

        System.out.println(splitArray(arr, target));

    }

    static public int splitArray(int[] nums, int m) {

        return 1;

    }
}
