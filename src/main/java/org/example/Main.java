package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PrimeFactorsFinder finder = new PrimeFactorsFinder();
        List<Integer> factors = finder.doFactor(1981980);
        System.out.println(factors);
    }
}