package com.company.LinearSearch;

public class Findmin {
    public static void main(String[] args) {
        int[] arr = {6,43,2,-97,34,1,0,-11};
        int min = Integer.MAX_VALUE;

        for(int i:arr){
            min = Math.min(i,min);
        }
        System.out.println(min);
    }
}
