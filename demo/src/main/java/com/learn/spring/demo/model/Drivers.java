package com.learn.spring.demo.model;

public class Drivers {
    private String name;
    private String team;

    public Drivers(String name, String team) {
        this.name = name;
        this.team = team;

    }


    public String getName() {
        return name;
    }


    public String getTeam() {
        return team;
    }
}
