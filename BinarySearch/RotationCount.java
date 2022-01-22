package com.company.BinarySearch;
//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
// example - Input : arr[] = {7, 9, 11, 12, 5}  Output: 4
// brute force ->
// 1. find pivot index -> index of largest no
// no of rotation = pivot +1

public class RotationCount {
    public static void main(String[] args) {

        int[] arr = {7, 9, 11, 12, 15};

        System.out.println(findPivot(arr) +1);


    }

    // this will not work in duplicate values
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // There are 4 cases

            // CASE 1:- eg- [ 4,5,6,7,0,1,2,3]
            // the pattern is asc desc asc
            // so for the desc part i.e 7,0 we use arr[mid] > arr[mid + 1]
            // we have put mid<end for the edge case when mid = end element then mid+1 will throw ArrayOutOfIndex exception
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // CASE 2:- eg- [6,7,0,1,2,3]  mid -> 0
            // we have put mid>start for the edge case when mid = start element then mid-1 will throw Array
            // mid-1 will be our pivot index
            if (mid > start && arr[mid-1] > arr[mid]) {
                return mid-1;
            }
            // we have covered cases when mid is just next to pivot on either side in case 1 & 2

            // case 3 when the mid value is less the start value
            //eg -. [ 6,7,0,1,2,3,4,5] here mid =2 and 2<6
            // so we know for such case we have mid in 2nd part of array and to get the largest number or pivot
            // we have to go right

            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {

                // if not case1,2 or 3 then the mid element has to be greater than start element
                // so move left for bigger value
                start = mid + 1;
                // so whynot start=mid cause mid can be the largest value
                // mid can be the largest value but then it should have already been caught in case 1 or 2
            }
        }
        return -1;
    }


}
