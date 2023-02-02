package com.bridgelabz.algorithm;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber2DArray {

    public static void main(String[] args) {

        int range = 1000;
        List<List<Integer>> result = new ArrayList<>();
        //iterate through each range (0-100, 100-200, ...)
        for (int i = 0; i < range; i += 100) {
            List<Integer> primeNumbers = new ArrayList<>();
            //find prime numbers in current range
            for (int j = i; j < i + 100 && j < range; j++) {
                if (isPrime(j)) {
                    primeNumbers.add(j);
                }
            }
            //Add the list of prime numbers to result
            result.add(primeNumbers);
        }
        System.out.println(result);
    }
    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

