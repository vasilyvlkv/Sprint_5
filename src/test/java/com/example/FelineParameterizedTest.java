package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class FelineParameterizedTest {

    private Feline feline = new Feline();

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3, 5})
    void testGetKittens(int kittensCount) {
        assertEquals(kittensCount, feline.getKittens(kittensCount));
    }
}
