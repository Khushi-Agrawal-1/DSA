package com.company.BinartSearch;

import java.util.Arrays;

//34. Find First and Last Position of Element in Sorted Array
public class rangeOfElement {
    public static void main(String[] args) {
        int[] arr = {5,6,7,7,7,8,8,10};
        int target =7;
        System.out.println(Arrays.toString(appOne(arr,target)));
        System.out.println(Arrays.toString(appTwo(arr,target)));

    }

    private static int[] appTwo(int[] nums, int target) {
        int[] arr = {-1,-1};
        if(nums.length==0){
            return arr;
        }
        arr[0] = search(nums, target, true);
        arr[1] = search(nums, target, false);

        return arr;
    }

    // approach --> 2
    private static int search(int[] nums, int target, boolean isFirst) {
        int x =-1;
        int start=0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid]>target){
                end = mid-1;
            }else if(nums[mid]<target){
                start = mid+1;
            }else if(nums[mid]==target){
                x = mid;
                if(isFirst){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return x;

    }


// approach --> 1

    static int[] appOne(int[] nums, int target) {

        // we will divide this problem into two parts
        // 1. find first occurrence of element

        int[] arr = {-1,-1};
        int start=0;
        int end = nums.length-1;

        if(nums.length==0){
            return arr;
        }

        // the moment we find target= nums[mid] we know if its not the fist occurrence then the
        // first occurrence would only be between the start and mid so we put arr[0]= mid everytime
        // we get target= nums[mid] and we do end = mid-1
        // rest is normal binary search

        while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid]>target){
                end = mid-1;
            }else if(nums[mid]<target){
                start = mid+1;
            }else if(nums[mid]==target){
                end = mid-1;
                arr[0]= mid;
            }
        }
        // 2. find last occurrence of element
        start=0;
        end = nums.length-1;


        while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid]>target){
                end = mid-1;
            }else if(nums[mid]<target){
                start = mid+1;
            }else if(nums[mid]==target){
                start = mid+1;
                arr[1]= mid;
            }
        }

        return arr;
    }
}
