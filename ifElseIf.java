package com.company;

import java.util.Scanner;

public class ifElseIf {

    public static void main(String[] args) {
        int n;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number : ");
        n = in.nextInt();
        System.out.println("Number entered is : " + n);
        if(n>5)
        {
            System.out.println(n + " is greater than 5");
        }
        else if (n==5)
        {
            System.out.println(n + " is equal to 5");
        }
        else
        {
            System.out.println(n + " is lesser than 5");
        }
    }
}
