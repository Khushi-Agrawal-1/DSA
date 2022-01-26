package com.company.Array;

import java.util.Arrays;

public class Smaller {
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};

        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));

    }
    static public int[] smallerNumbersThanCurrent(int[] nums) {


        for(int i=0;i<nums.length;i++){
            int count =0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]  && j != i ){
                    count++;
                }
            }
            nums[i]= count;
        }
        return nums;
    }
}
