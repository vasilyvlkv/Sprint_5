package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlexLionTest {

    @Test
    void testGetFriends() throws Exception {
        AlexLion alex = new AlexLion();
        assertEquals(List.of("Марти", "Глория", "Мелман"), alex.getFriends());
    }

    @Test
    void testGetPlaceOfLiving() throws Exception {
        AlexLion alex = new AlexLion();
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    void testGetKittens() throws Exception {
        AlexLion alex = new AlexLion();
        assertEquals(0, alex.getKittens());
    }
}
