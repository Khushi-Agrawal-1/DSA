package com.company.Array;
// https://leetcode.com/problems/concatenation-of-array/
import java.util.Arrays;

public class concat {
    public static void main(String[] args) {
        int[] arr = {5,1,3};

        System.out.println(Arrays.toString(getConcatenation(arr)));
    }

    static public int[] getConcatenation(int[] nums) {

        int[] arr = new int[2*(nums.length)];

        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
            arr[nums.length+i]=nums[i];

        }
        return arr;

    }
}
