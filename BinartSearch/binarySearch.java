package com.company.BinartSearch;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,7,8,9};
        int element =7;
        System.out.println(search(arr,element));
    }

    private static int search(int[] arr, int element) {
        int start=0;
        int end= arr.length-1;

        while(start<=end){
//            int mid = (start+end)/2;
            //optimisation in finding middle element
            //start+end might exceed the limit of integer so optimized it

            int mid = start + (end-start)/2;

            if(arr[mid]==element){
                return mid;
            }
            else if(arr[mid]>element){
                //go right
                end = mid-1;
            }
            else{
                //go left
                start=mid+1;
            }
        }
        return -1;
    }
}
