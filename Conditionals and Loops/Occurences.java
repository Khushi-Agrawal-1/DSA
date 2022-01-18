package com.company;

import java.util.Scanner;

public class Occurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int x = sc.nextInt();
        int count =0;

        do{
            int a = n % 10 ;
            n=n/10;
            if(a==x){
                count++;
            }
        }while (n!=0);

        System.out.println(count);


    }
}
