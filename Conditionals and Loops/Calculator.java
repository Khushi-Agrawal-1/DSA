package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            char op = sc.next().trim().charAt(0);
            if(op=='+' || op=='-' || op=='/' || op=='*' || op=='%' ){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int result=0;

                switch (op){
                    case '+':
                        result=a+b;
                        break;
                    case '-':
                        result=a-b;
                        break;
                    case '*':
                        result=a*b;
                        break;
                    case '/':
                        result=a/b;
                        break;
                    case '%':
                        result=a%b;
                }
                System.out.println(result);
            }
            else if( op =='x' || op =='X'){
                break;
            }else{
                System.out.println("invalid");
            }

        }
    }
}
