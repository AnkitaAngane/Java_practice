package com.company;

import java.util.HashMap;

public class hashMap {

    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("INDIA", "Delhi");
        capitalCities.put("AFGHANISTAN", "Kabul");
        capitalCities.put("JAPAN", "Tokyo");
        capitalCities.put("USA", "Washington DC");
        System.out.println("Hash Map is : "+capitalCities);

        System.out.println("Size of hash map is "+capitalCities.size());
        System.out.println("Element at key INDIA is "+capitalCities.get("INDIA"));
        System.out.println("Removing element JAPAN "+capitalCities.remove("JAPAN"));
        System.out.println("Size of hash map is "+capitalCities.size());
    }
}
