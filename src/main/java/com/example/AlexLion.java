package com.example;

import java.util.List;

public class AlexLion extends Lion {

    public AlexLion() throws Exception {
        super("Самец", new Feline()); // всегда самец
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

    @Override
    public int getKittens() {
        return 0;
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }
}
