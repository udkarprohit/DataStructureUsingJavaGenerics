package com.bridgelabz.algorithm;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String first = "abcd";
        String second = "dcba";
        if (areAnagrams(first, second)) {
            System.out.println("The two strings are anagrams.");
        } else {
            System.out.println("The two strings are not anagrams.");
        }
    }
    public static boolean areAnagrams(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        char[] firstArray = first.toCharArray();
        char[] secondArray = second.toCharArray();
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        return Arrays.equals(firstArray, secondArray);
    }
}

