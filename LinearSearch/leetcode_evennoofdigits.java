package com.company.LinearSearch;

public class leetcode_evennoofdigits {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] arr = {12,345,2,6,7896};
        System.out.println(find(arr));

        long endTime = System.nanoTime() - startTime;
        System.out.println(endTime);

    }

    private static int find(int[] arr) {
        int count =0;
        for(int i:arr){
           if(((int)(Math.log10(i))+1)%2==0){
                count++;
            }
        }
        return count;
    }
}
// shortcut for no of digits = (int)(Math.log10(i))+1