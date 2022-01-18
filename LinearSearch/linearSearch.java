package com.company.LinearSearch;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {3,5,3,2,6,8,9};
        int element =3;

        System.out.println(search(arr,element));
    }

    private static int search(int[] arr, int element) {
        int index=0;
        for(int i: arr){
            if(i == element){
                return index;
            }
            index++;
        }
        return -1;
    }
}
