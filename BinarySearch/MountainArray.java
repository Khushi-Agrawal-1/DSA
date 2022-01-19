package com.company.BinartSearch;


public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1,44,30,21,11,3};
        System.out.println(peak(arr));
    }

    private static int peak(int[] arr) {
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

            // we dont need anything for arr[mid] == arr[mid+1] because in ques we are given
            // their can be only on max element
            //arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

        }
        return start;
    }

    // everything was ok except - when we have array like [ 1,44,30,21,11,3]
//    private static int peak(int[] arr) {
//        int start=0;
//        int end =arr.length-1;
//
//        while(start<=end){
//            int mid = start+(end-start)/2;
//
//            if(arr[start]<arr[mid]){
//                start=mid;
//            }else if(arr[start]>arr[mid]){
//                end= mid-1;
//            }else{
//                if(arr[start]>arr[start+1]){
//                    return start;
//                }else{
//                    start= mid+1;
//                }
//            }
//        }
//        return start;
//    }
}
