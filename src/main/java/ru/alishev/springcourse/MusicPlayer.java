package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Value;

import java.util.Map;
import java.util.Random;

public class MusicPlayer {

    @Value("${musicPlayer.volume}")
    private int volume;
    @Value("${musicPlayer.name}")
    private String name;
    private Map<Genre, Music> musicList;

    public MusicPlayer(Map<Genre, Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        Random random = new Random();
        Music music = musicList.get(Genre.values()[random.nextInt(3)]);
        return music != null ? music.getSong().get(random.nextInt(3)) : null;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
