package com.company;

public class CoracleWorshipLeaders {
    String name;
    double time;
    String day;

    public CoracleWorshipLeaders(String name, double time, String day) {
        this.name = name;
        this.time = time;
        this.day = day;
    }

    public void playGuitar (String name, double time, String day ){
        this.name = name;
        this.time = time;
        this.day = day;
        System.out.println("Coracle Worship leader for " + day +" is " + name + " at " + time);
    }
}
