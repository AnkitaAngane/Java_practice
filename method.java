package com.company;

public class method {
    public static void display(int a){
        System.out.println("Method with single parameter");
        System.out.println("Value: " + a);
    }

    public static void display(int a, int b){
        System.out.println("Method with two parameters");
        System.out.println("Values are : " + a + " and " + b);
    }
    public static void main(String[] args) {
	    display(4);
	    display(4,3);
    }
}
