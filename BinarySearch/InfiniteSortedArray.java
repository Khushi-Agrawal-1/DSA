package com.company.BinartSearch;

public class InfiniteSortedArray {
    public static void main(String[] args) {
        // Find position of an element in a sorted array of infinite numbers
        // brute force -> linear search
        // as sorted array -> binary search
        // so infinite numbers -> we cannot use .length method
        // so prb is reduced to finding the start and end index and rest is normal binary search

        int[] arr = {5,6,7,7,7,8,8,10};
        int target =7;
        System.out.println(findRange(arr,target));
    }

    private static int findRange(int[] arr, int target) {
        int box = 2;
        int start=0;
        int end =1;
        // in binary search we go from N-N/2-N/4-----1
        // its reverse of this here the box starts from -> 1-------N/4-N/2-N

        while(target>arr[end]){
            start = end+1;
            end = end + 2*box;

//            int temp = end+1;
//            end = end+(end-start+1);
//            start = temp; // we can only update start after end or else it will affect the value of end
        }
        return infinite(arr,target,start,end);
    }

    private static int infinite(int[] arr, int target, int start, int end) {

        while(start<=end){
            int mid = start + (end - start)/2;

            if(target>arr[mid]){
                start= mid+1;
            }else if(target<arr[mid]){
                end = mid-1;
            }else{
                return mid;
            }
        }

        return -1;
    }
}
