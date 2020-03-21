package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.crypto.MacSpi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("ru.alishev.springcourse")
public class SpringConfig {

//    @Autowired
//    public List<Music> musicList(RockMusic rockMusic, PopMusic popMusic, ClassicalMusic classicalMusic) {
//        return Arrays.asList(rockMusic, popMusic, classicalMusic);
//    }

//    String classicalName = "Classical";
//
//    @Bean
//    @Scope("prototype")
//    public ClassicalMusic classicalMusic() {
//        return new ClassicalMusic(classicalName);
//    }
//
//    @Bean
//    @Scope("prototype")
//    public RockMusic rockMusic() {
//        return new RockMusic("Rock");
//    }
//
//
//    @Bean
//    public PopMusic popMusic() {
//        return new PopMusic("Pop");
//    }
//
//    @Bean
//    public MusicPlayer musicPlayer() {
//        return new MusicPlayer((Arrays.asList(rockMusic(), classicalMusic(), popMusic())));
//    }
//
//    @Bean
//    public Computer computer() {
//        return new Computer(musicPlayer());
//    }
}
