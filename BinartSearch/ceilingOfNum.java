package com.company.BinartSearch;

public class ceilingOfNum {
    public static void main(String[] args) {
        int[] arr ={1,3,6,7,9,45,56};
        int target = 564;
        // ceiling of a no is the smallest element in array that is >= target

        System.out.println(ceiling(arr,target));
    }

    private static int ceiling(int[] arr, int target) {
        int m=0;
        int start =0;
        int end =arr.length-1;

        //edge case
        if(target>arr[end]){
            return -1;
        }

        while(start<=end){
            m = start + (end-start)/2;
            if(arr[m]<target){
                //right
                start=m+1;
            }else if(arr[m]>target){
                //left
                end =m-1;
            }else{
                return arr[m];
            }

        }
        return arr[m];



    }
}
