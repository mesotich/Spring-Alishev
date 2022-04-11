package ru.alishev.springcourse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PopMusic implements Music {

    @Override
    public List<String> getSong() {
        return new ArrayList<>(Arrays.asList("Поп1", "Поп2", "Поп3"));
    }
}
