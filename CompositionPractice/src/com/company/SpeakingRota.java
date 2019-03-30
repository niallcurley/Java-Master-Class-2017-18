package com.company;

public class SpeakingRota {
    private String name;
    private String date;
    private String subject;

    public SpeakingRota(String name, String date, String subject) {
        this.name = name;
        this.date = date;
        this.subject = subject;
    }

    public void SharingToday (String name, String date, String subject){
        this.name = name;
        this.date = date;
        this.date = subject;
        System.out.println(name + " is speaking on " + date + "the theme is " + subject );
    }
}
