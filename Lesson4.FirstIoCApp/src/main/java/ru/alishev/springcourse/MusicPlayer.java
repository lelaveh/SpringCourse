package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

/**
 * @author Neil Alishev
 */
@Component
@PropertySource("classpath:musicPlayer.properties")
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private List<Music> musicList;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }


    @Autowired
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }



    public void playMusic() {
        System.out.println("Playing: " + musicList.get((int) (Math.random() * musicList.size())).toString());
    }

    @PostConstruct
    public void myInit() {
        System.out.println("Init");
    }

    @PreDestroy
    public void myDestroy() {
        System.out.println("Destroy");
    }
}
