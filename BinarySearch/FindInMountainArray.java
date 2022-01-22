package com.company.BinarySearch;

public class FindInMountainArray {
    //1095. Find in Mountain Array

    // 1. find peak in mountain array
    // if peak == target -> return index
    // apply binary search in btw start and peak
    // if not found then find target btw peak and end
    //else return -1
    // worst case - 3logN which is logN

    public static void main(String[] args) {
        int[] arr = {1, 44, 30, 21, 11, 3};
        int target =11;
        System.out.println(peak(target,arr));

    }

    public static int peak(int target, int[] arr) {

        // find peak
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if(arr[mid]>arr[mid+1]){
                // second half is desc part
                //possibility that mid is the largest value
                end = mid;
            }else if (arr[mid]<arr[mid+1]){
                // means we r in asc part
                start = mid+1;
            }
        }

        int peak = start;
        if(arr[peak] ==target){
            return peak;
        }
        int first = find(target, arr, 0,peak );

        if(first!=-1){
            return first;
        }else{
            return find(target, arr, peak+1,arr.length-1);

        }

    }

    public static int find(int target, int[] arr, int start, int end) {

       boolean isAsc = arr[start] < arr[end];
       // mountain array

        while(start<=end){

            int mid = start + (end-start)/2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}
