package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import java.util.List;

class FelineTest {

    private Feline feline = new Feline();

    @Test
    void testEatMeat() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    void testGetFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    void testGetKittens() {
        assertEquals(1, feline.getKittens());
        assertEquals(3, feline.getKittens(3));
    }
}
