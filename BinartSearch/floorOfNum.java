package com.company.BinartSearch;

public class floorOfNum {
    public static void main(String[] args) {
        int[] arr ={1,3,6,7,9,45,56};
        int target = 4;
        // floor of a no is the largest element in array that is <= target

        System.out.println(floor(arr,target));
    }

    static int floor(int[] arr, int target) {
        int m;
        int start =0;
        int end =arr.length-1;

        // edge case is getting solved on its own --> end will become -1
//        if(target<arr[0]){
//            return -1;
//        }

        while(start<=end){
            m=start+(end-start)/2;

            if(arr[m]>target){
                //left
                end=m-1;
            }else if(arr[m]<target){
                //right
                start= m+1;
            }else{
                return m;
            }
        }
        return arr[end];
    }
}
