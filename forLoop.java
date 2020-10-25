package com.company;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class forLoop {

    public static void main(String[] args) throws IOException {
	    int n,i,r;
		//DataInputStream dis = new DataInputStream(System.in);
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number : ");
		n = in.nextInt();
		System.out.println(n);
		for(i=1; i<=10; i++)
		{
			r=n*i;
			System.out.println(n + "x" + i + "=" + r);
		}

    }
}
