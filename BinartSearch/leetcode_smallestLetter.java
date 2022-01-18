package com.company.BinartSearch;

public class leetcode_smallestLetter {

    public static void main(String[] args) {
        //744. Find Smallest Letter Greater Than Target
        char[] arr ={'c','f','j'};
        char target = 'j';
        // smallest element in array that is > target
        System.out.println(ceiling(arr,target));
    }
    private static char ceiling(char[] letters, char target) {
        int start =0;
        int end =letters.length;
// why not int end =letters.length-1; for Input: letters = ["c","f","j"], target = "j"
// this is actually for the last element so if we get target = letters[letters.length-1]
// then as we have condition start<end therefore we will return start i.e equal to end element
// which we donot want we want the loop once more so that start becomes > no of indexes in
// that array so when we do the mod in return statement it will give the first element



        while(start<end){
            int m = start + (end-start)/2;

            // why <= check for Input: letters = ["c","f","j"], target = "c"
            // sp basically we are returning start so we get the target at m index and as we
            //have to send the next greatest char therefore we are moving start once index ahead
            // if by chance that letters[m] is last char in the array also then also our
            // start will be = letters.length and returning the mod it will give the 1st index
            if(letters[m]<=target){
                //right
                start=m+1;
            }else {
                //left
                end =m;
            }

        }
        return letters[start% letters.length];



    }
}




