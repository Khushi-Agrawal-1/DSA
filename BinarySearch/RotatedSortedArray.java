package com.company.BinarySearch;
//33. Search in Rotated Sorted Array- leetcode
//https://leetcode.com/problems/search-in-rotated-sorted-array/
// brute force->
// find pivot -> index of highest value
// if target>nums[start] -> btw start and pivot
// else btw pivot and end
// apply binary search accordingly


public class RotatedSortedArray {
    public static void main(String[] args) {

        int[] arr = {5,1,3};
        int target =1;

        System.out.println(search(arr,target));


    }

    static int search(int[] nums, int target) {

        int pivot = findPivot(nums);

        // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(nums, target, 0 , nums.length - 1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            // then it should be in 1st half of the array eg -> [4,5,6,7,0,1,2,3] target-> 6
            return binarySearch(nums, target, 0, pivot - 1);
        }
        // if not then it has to be in 2nd half of the array eg -> [4,5,6,7,0,1,2,3] target-> 2

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
 //            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
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


    // FOR DUPLICATE VALUES
    // we cannot decide which part of array it is base on previous comparisons
    // eg -> [4,7,4,4,4,4]
    // find pivot ignoring as many duplicates
    //

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
