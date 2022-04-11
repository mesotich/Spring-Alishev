package ru.alishev.springcourse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RockMusic implements Music {

    @Override
    public List<String> getSong() {
        return new ArrayList<>(Arrays.asList("Рок1", "Рок2", "Рок3"));
    }
}
