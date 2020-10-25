package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class array{

    public static void main(String[] args) {

        ArrayList<String> Names = new ArrayList<String>();
        Names.add("ANKITA");
        Names.add("VINAYAK");
        Names.add("AKSHATA");
        Names.add("SACHIN");
        System.out.println(Names);

        System.out.println("Index 0 value is " +Names.get(0));

        System.out.println("Modified value at index 2");
        Names.set(2, "ARTI");
        System.out.println(Names);

        System.out.println("Size of array is " +Names.size());
        
        System.out.println("Removing Item at index 2");
        Names.remove(2);
        System.out.println(Names);

    }
}
