package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    @Override
    public List<String> getSong() {
        return new ArrayList<>(Arrays.asList("Клас№1", "Класс2", "Класс3"));
    }
}
