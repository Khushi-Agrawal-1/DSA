package com.company.BinarySearch;

import java.util.Arrays;

// q-> find the target element index when given that the rows and columns of the matrix
// are arranged in ascending order
public class RowColumnMatrix {
    public static void main(String[] args) {
        int[][] arr = {{2,4,8},{3,9,11},{7,22,26}};
        int target = 23;

        System.out.println(Arrays.toString(search(arr,target)));
    }

    private static int[] search(int[][] arr, int target) {
        int row =0;
        int col = arr.length-1;

        while(row< arr.length && col>=0 ) {
            int element = arr[row][col];

            if(target>element){
                // this is the largest number in that row
                // because lets say for first iteration we r that arr[0][arr.length-1]
                row++;
            }
            if(target<element){
                // the column is in ascending order so if the first element is itself
                // larger than element then
                col--;
            }
            if(target==element){
                return new int[]{row,col};
            }

        }
        return new int[]{-1,-1};
    }
}
