package com.example.eva_01;

public class Routine {
    private String name;
    private String description;

    public Routine(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}