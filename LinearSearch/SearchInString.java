package com.company.LinearSearch;

import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char element = sc.next().trim().charAt(0);

        System.out.println(approachOne(s,element));
        System.out.println(approachTwo(s,element));

        long endTime = System.nanoTime() - startTime;
        System.out.println(endTime);
    }

    private static boolean approachTwo(String s, char element) {
        if(s.length()==0){
            return false;
        }

        for(int i=0;i<s.length();i++){
            if(element==s.charAt(i)){
                return true;
            }
        }
        return false;
// time ->  9715255100
    }

    private static boolean approachOne(String s, char element) {
        if(s.length()==0){
            return false;
        }

        for(char c: s.toCharArray()){
            if(c==element){
                return true;
            }

        }
        return false;
        // time -> 7784521300
    }
}
