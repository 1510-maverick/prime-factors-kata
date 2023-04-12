package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Collections.emptyList;
import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorsFinderTest {

    @Test
    void doFactor_whenInputIs1_thenReturnsEmptyList() {
        PrimeFactorsFinder finder = new PrimeFactorsFinder();

        List<Integer> factors = finder.doFactor(1);

        assertIterableEquals(emptyList(), factors);
    }

    @Test
    void doFactor_whenInputIs2_thenReturnsEmptyList() {
        PrimeFactorsFinder finder = new PrimeFactorsFinder();

        List<Integer> factors = finder.doFactor(2);

        assertIterableEquals(List.of(2), factors);
    }

    @Test
    void doFactor_whenInputIs3_thenReturnsEmptyList() {
        PrimeFactorsFinder finder = new PrimeFactorsFinder();

        List<Integer> factors = finder.doFactor(3);

        assertIterableEquals(List.of(3), factors);
    }

    @Test
    void doFactor_whenInputIs4_thenReturnsEmptyList() {
        PrimeFactorsFinder finder = new PrimeFactorsFinder();

        List<Integer> factors = finder.doFactor(4);

        assertIterableEquals(List.of(2, 2), factors);
    }

    @Test
    void doFactor_whenInputIs5_thenReturnsEmptyList() {
        PrimeFactorsFinder finder = new PrimeFactorsFinder();

        List<Integer> factors = finder.doFactor(5);

        assertIterableEquals(List.of(5), factors);
    }

    @Test
    void doFactor_whenInputIs6_thenReturnsEmptyList() {
        PrimeFactorsFinder finder = new PrimeFactorsFinder();

        List<Integer> factors = finder.doFactor(6);

        assertIterableEquals(List.of(2, 3), factors);
    }

    @Test
    void doFactor_whenInputIs7_thenReturnsEmptyList() {
        PrimeFactorsFinder finder = new PrimeFactorsFinder();

        List<Integer> factors = finder.doFactor(7);

        assertIterableEquals(List.of(7), factors);
    }

    @Test
    void doFactor_whenInputIs8_thenReturnsEmptyList() {
        PrimeFactorsFinder finder = new PrimeFactorsFinder();

        List<Integer> factors = finder.doFactor(8);

        assertIterableEquals(List.of(2, 2, 2), factors);
    }

    @Test
    void doFactor_whenInputIs9_thenReturnsEmptyList() {
        PrimeFactorsFinder finder = new PrimeFactorsFinder();

        List<Integer> factors = finder.doFactor(9);

        assertIterableEquals(List.of(3, 3), factors);
    }

    @Test
    void doFactor_whenInputIs10_thenReturnsEmptyList() {
        PrimeFactorsFinder finder = new PrimeFactorsFinder();

        List<Integer> factors = finder.doFactor(10);

        assertIterableEquals(List.of(2, 5), factors);
    }

    @Test
    void doFactor_whenInputIs11_thenReturnsEmptyList() {
        PrimeFactorsFinder finder = new PrimeFactorsFinder();

        List<Integer> factors = finder.doFactor(11);

        assertIterableEquals(List.of(11), factors);
    }

    @Test
    void doFactor_whenInputIs1981980_thenReturnsEmptyList() {
        PrimeFactorsFinder finder = new PrimeFactorsFinder();

        List<Integer> factors = finder.doFactor(1981980);

        assertIterableEquals(List.of(2, 2, 3, 3, 5, 7, 11, 11, 13), factors);
    }
}