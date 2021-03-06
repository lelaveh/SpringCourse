package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Neil Alishev
 */

@Component
public class RockMusic extends Music {
    public RockMusic(@Value("${rockMusic.name}") String name) {
        super(name);
    }
}
