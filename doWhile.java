package com.company;

public class doWhile {

    public static void main(String[] args) {
        int i=1;
        int n=0;
        do{
            n=2*i;
            System.out.println(n);
            i=n;
        }while(i<=256);
    }
}
