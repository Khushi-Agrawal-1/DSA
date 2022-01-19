package com.company.BinartSearch;

public class Order_Agnostic_Binary_Search {
    public static void main(String[] args) {
        //we dont know if the array is sorted in ascending or descending order
        int[] arr = {75,23,7,4,1,0,-754};
        int element =7;
        if(arr[0]<arr[arr.length-1]){
        System.out.println(ascending(arr,element));
        }else{
            System.out.println(descending(arr,element));
        }
    }

    private static int descending(int[] arr, int element) {
        int start=0;
        int end= arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid]==element){
                return mid;
            }
            else if(arr[mid]<element){
                //go left
                end = mid-1;
            }
            else{
                //go right
                start=mid+1;
            }
        }
        return -1;
    }


    private static int ascending(int[] arr, int element) {
        int start=0;
        int end= arr.length-1;

        while(start<=end){
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