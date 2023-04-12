package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeFactorsFinder {

    public List<Integer> doFactor(int number) {
        List<Integer> factors = new ArrayList<>();

        if (number <= 0 || number == 1) {
            return Collections.emptyList();
        }

        int divisor = 2;

        while (divisor <= number) {
            while (number % divisor == 0) {
                number = number / divisor;
                factors.add(divisor);
            }

            divisor++;
        }

        if (number > 1) {
            factors.add(number);
        }

        return factors;
    }
}
