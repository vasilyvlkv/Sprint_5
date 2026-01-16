package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class LionTest {

    @Test
    void testLionWithMale() throws Exception {
        Feline mockedFeline = mock(Feline.class);
        when(mockedFeline.getKittens()).thenReturn(2);

        Lion lion = new Lion("Самец", mockedFeline);
        assertEquals(2, lion.getKittens());
        assertTrue(lion.doesHaveMane());
    }

    @Test
    void testLionWithFemale() throws Exception {
        Feline mockedFeline = mock(Feline.class);
        Lion lion = new Lion("Самка", mockedFeline);
        assertFalse(lion.doesHaveMane());
    }

    @Test
    void testGetFood() throws Exception {
        Feline mockedFeline = mock(Feline.class);
        when(mockedFeline.getFood("Хищник")).thenReturn(List.of("Мясо"));

        Lion lion = new Lion("Самец", mockedFeline);
        assertEquals(List.of("Мясо"), lion.getFood());
    }
}
