package com.company;

public class constructor {

    int a=5,b=5;

    public constructor()
    {
        System.out.println("This is default Constructor");
        int c=a+b;
        System.out.println("Sum of two numbers is : " +c);
    }

    public constructor(int a, int b)
    {
        System.out.println("This is parameterized Constructor");
        int c=a+b;
        System.out.println("Sum of two numbers is : " +c);
    }

    public static void main(String[] args) {

        constructor def=new constructor();
        constructor param=new constructor(2,3);
        
    }
}
