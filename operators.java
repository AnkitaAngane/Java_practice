package com.company;

public class operators {

    public static void main(String[] args) {
        int a=10;
        int b=5;
        a+=5;
        System.out.println("a+= : "+a);
        a-=5;
        System.out.println("a-= : "+a);
        a*=5;
        System.out.println("a*= : "+a);
        a/=5;
        System.out.println("a/= : "+a);
        System.out.println("a==b : "+(a==b));
        System.out.println("a!=b : "+(a!=b));
        System.out.println("a>b : "+(a>b));
        System.out.println("a<b : "+(a<b));
        System.out.println("a>=b : "+(a>=b));
        System.out.println("a<=b : "+(a<=b));
        System.out.println("&& for a>1 and b<10 : "+(a>1 && b<10));
        System.out.println("|| for a>1 and b<10 : "+(a>1 || b<10));
        
    }
}
