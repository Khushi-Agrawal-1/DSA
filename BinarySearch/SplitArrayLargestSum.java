package com.company.BinarySearch;

// https://leetcode.com/problems/split-array-largest-sum/
public class SplitArrayLargestSum {
    public static void main(String[] args) {
        // continous elements-> minimize the largest sum among these m subarrays.

        int[] arr = {7,2,5,10,8 };
        int m = 2;

        System.out.println(splitArray(arr, m));

    }

    static public int splitArray(int[] nums, int m) {

        int start=0;
        int end =0;

        for(int i =0;i<nums.length;i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }
// so the range of sum is [start,end ]
// we can apply binary search on this now 

    while(start<end)
    {
        int mid = start +(end - start)/2;
        int sum =0;
        int pieces =1;

        for(int n:nums){

            if(sum+n>mid){
                // means adding this elemnet we will exceed the max limit of sum we set so we have to start a new piece or subarray
                sum = n; // cause start sum of that new subarray will be the no itself
                pieces++;
            }else{
                sum+=n;
            }

            if(pieces<=m){
                end= mid;
            }else{
                start=mid+1;
            }

        }
    }

        return start; // here end == start

    }
}
