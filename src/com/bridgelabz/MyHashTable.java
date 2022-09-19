package com.bridgelabz;


public class MyHashTable {

    public static void main(String[] args) {

        String sentence = "To be or not to be";

        String[] words = sentence.toLowerCase().split(" ");

        MyHashMap<String, Integer> myhashMap = new MyHashMap<>();

        for (String word : words) {
            Integer value = myhashMap.get(word);
            if (value == null) value = 1;
            else value = value + 1;
            myhashMap.add(word, value);
        }

        int frequency = (int) myhashMap.get("to");

        System.out.println(myhashMap);
       // System.out.println(frequency);


    }
}