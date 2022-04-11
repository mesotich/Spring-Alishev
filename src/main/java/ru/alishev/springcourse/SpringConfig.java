package ru.alishev.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.HashMap;
import java.util.Map;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public PopMusic popMusic() {
        return new PopMusic();
    }

    @Bean
    public Map<Genre, Music> map() {
        Map<Genre, Music> result = new HashMap<>();
        result.put(Genre.CLASSICAL, classicalMusic());
        result.put(Genre.ROCK, rockMusic());
        result.put(Genre.POP, popMusic());
        return result;
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(map());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
