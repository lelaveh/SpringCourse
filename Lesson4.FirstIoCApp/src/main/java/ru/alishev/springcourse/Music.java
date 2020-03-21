package ru.alishev.springcourse;

import java.util.List;

/**
 * @author Neil Alishev
 */
public abstract class Music {
    protected String name;

    public Music(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
