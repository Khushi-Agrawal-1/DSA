package com.company.LinearSearch;

import org.omg.CORBA.INTERNAL;

public class leetcode_richestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        System.out.println(maxWealth(accounts));
    }

    private static int maxWealth(int[][] accounts) {


        int max = Integer.MIN_VALUE;

        for(int[] a:accounts){
            int sum =0;
            for(int i:a){
                sum+=i;
            }
            max = Math.max(max,sum);
        }
        return max;

    }
}
