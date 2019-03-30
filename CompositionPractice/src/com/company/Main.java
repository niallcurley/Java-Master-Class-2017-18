package com.company;

public class Main {

    public static void main(String[] args) {
        CoracleKids coracleKids = new CoracleKids("John Gibson", "Rush Park", 1970,"male" );
        CoracleWorshipLeaders coracleWorshipLeaders = new CoracleWorshipLeaders("Mark McDonnell", 11.30, "Sunday");
        CleaningRota cleaningRota = new CleaningRota("Doris Day", 1.30, "Sunday", 3, 20);
        SpeakingRota speakingRota = new SpeakingRota("Terry Hogg", "23.111.17", "The Wells Of Ireland");



	Coracle coracle = new Coracle (coracleWorshipLeaders, coracleKids,cleaningRota, speakingRota);

        coracle.getCoracleKids().getName();
        coracle.getCoracleKids().noOfKids(16);
        coracle.getCoracleKids().getName();
        coracle.getSpeakingRota().SharingToday("John Jones","12 Jan", "History");
        coracle.getCleaningRota().hooverRoom();
        coracle.getCleaningRota().makeTea(4);

        coracle.getCoracleKids().noOfKids(12);
        coracle.getCleaningRota().hooverRoom();
        coracle.getCleaningRota().getName();
        coracle.getCoracleWorshipLeaders().playGuitar("Ben", 1.30,"Sunday");
        System.out.println(coracle.getCoracleKids().getName());

        coracle.getCleaningRota().makeTea(12);



    }
}
