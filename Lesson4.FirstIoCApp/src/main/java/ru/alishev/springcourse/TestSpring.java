package ru.alishev.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Neil Alishev
 */


public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);
//        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
//        PopMusic popMusic = context.getBean("popMusic", PopMusic.class);
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        Computer computer = context.getBean("computer", Computer.class);
        computer.getMusicPlayer().playMusic();
        context.close();
    }
}
