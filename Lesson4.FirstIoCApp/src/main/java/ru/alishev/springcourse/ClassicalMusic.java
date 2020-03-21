package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Neil Alishev
 */

@Component
@PropertySource("classpath:musicPlayer.properties")
public class ClassicalMusic extends Music {

    public ClassicalMusic(@Value("${classicalMusic.name}") String name) {
        super(name);
    }


}
