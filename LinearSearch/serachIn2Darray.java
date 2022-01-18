package com.company.LinearSearch;

public class serachIn2Darray {
    public static void main(String[] args) {
        int[][] arr = { {2,3},{4,5,2},{3,2,7,8}};
        int element = 7;
        System.out.println(appOne(arr,element));
        System.out.println(appTwo(arr,element));

    }

    private static boolean appOne(int[][] arr, int element) {
        for(int[] i:arr){
            for(int j:i){
                if(j==element){
                    return true;
                }
            }
        }
        return false;
    }

    static int[] appTwo(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
