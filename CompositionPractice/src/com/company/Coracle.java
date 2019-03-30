package com.company;

public class Coracle {
    private CoracleWorshipLeaders coracleWorshipLeaders;
    private CoracleKids coracleKids;
    private CleaningRota cleaningRota;
    private SpeakingRota speakingRota;

    public Coracle(CoracleWorshipLeaders coracleWorshipLeaders, CoracleKids coracleKids, CleaningRota cleaningRota, SpeakingRota speakingRota) {
        this.coracleWorshipLeaders = coracleWorshipLeaders;
        this.coracleKids = coracleKids;
        this.cleaningRota = cleaningRota;
        this.speakingRota = speakingRota;
    }

    public CoracleWorshipLeaders getCoracleWorshipLeaders() {
        return coracleWorshipLeaders;
    }

    public CoracleKids getCoracleKids() {
        return coracleKids;
    }

    public CleaningRota getCleaningRota() {
        return cleaningRota;
    }

    public SpeakingRota getSpeakingRota() {
        return speakingRota;
    }


}
