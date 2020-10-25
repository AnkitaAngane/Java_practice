package com.company;

import java.util.Scanner;

public class whileLoop {

    public static void main(String[] args) {

        int i=1;
        int n=0;
	    while(i<=256)
        {
            n=2*i;
            System.out.println(n);
            i=n;
        }
    }
}
