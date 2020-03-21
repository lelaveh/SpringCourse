package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PopMusic extends Music{
    public PopMusic(@Value("${popMusic.name}") String name) {
       super(name);
    }
}
