package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CatTest {

    @Test
    void testGetSound() {
        Cat cat = new Cat(Mockito.mock(Feline.class));
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    void testGetFood() throws Exception {
        Feline feline = mock(Feline.class);
        when(feline.eatMeat()).thenReturn(List.of("Мясо"));

        Cat cat = new Cat(feline);
        assertEquals(List.of("Мясо"), cat.getFood());
    }
}
