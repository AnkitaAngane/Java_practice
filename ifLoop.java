package com.company;

import java.util.Scanner;

public class ifLoop {

    public static void main(String[] args) {
        int n;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number : ");
        n = in.nextInt();
        System.out.println("Number entered is : " + n);
        if(n>=5)
        {
            System.out.println(n + " is greater than equal to 5");
        }
    }
}
