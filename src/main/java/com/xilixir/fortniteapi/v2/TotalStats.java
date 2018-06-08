package com.xilixir.fortniteapi.v2;

public class TotalStats extends Stats {

    private double soloScore;
    private double duoScore;
    private double squadScore;
    private double soloMatchesPlayed;
    private double duoMatchesPlayed;
    private double squadMatchesPlayed;
    private long soloLastModified;
    private long duoLastModified;
    private long squadLastModified;
    private double soloWins;
    private double duoWins;
    private double squadWins;
    private double soloMinutesPlayed;
    private double duoMinutesPlayed;
    private double squadMinutesPlayed;
    private double soloKills;
    private double duoKills;
    private double squadKills;
    private double squadTop3;
    private double squadTop6;
    private double duoTop12;
    private double duoTop5;
    private double soloTop25;
    private double soloTop10;

    public TotalStats(PCStats pcStats, PS4Stats ps4Stats, XB1Stats xb1Stats) {
        soloScore = pcStats.getSoloScore() + ps4Stats.getSoloScore() + xb1Stats.getSoloScore();
        duoScore = pcStats.getDuoScore() + ps4Stats.getDuoScore() + xb1Stats.getDuoScore();
        squadScore = pcStats.getSquadScore() + ps4Stats.getSquadScore() + xb1Stats.getSquadScore();
        soloMatchesPlayed = pcStats.getSoloMatchesPlayed() + ps4Stats.getSoloMatchesPlayed() + xb1Stats.getSoloMatchesPlayed();
        duoMatchesPlayed = pcStats.getDuoMatchesPlayed() + ps4Stats.getDuoMatchesPlayed() + xb1Stats.getDuoMatchesPlayed();
        squadMatchesPlayed = pcStats.getSquadMatchesPlayed() + ps4Stats.getSquadMatchesPlayed() + xb1Stats.getSquadMatchesPlayed();
        soloLastModified = Math.max(xb1Stats.getSoloLastModified(), Math.max(pcStats.getSoloLastModified(), ps4Stats.getSoloLastModified()));
        duoLastModified = Math.max(xb1Stats.getDuoLastModified(), Math.max(pcStats.getDuoLastModified(), ps4Stats.getDuoLastModified()));
        squadLastModified = Math.max(xb1Stats.getSquadLastModified(), Math.max(pcStats.getSquadLastModified(), ps4Stats.getSquadLastModified()));
        soloWins = pcStats.getSoloWins() + ps4Stats.getSoloWins() + xb1Stats.getSoloWins();
        duoWins = pcStats.getDuoWins() + ps4Stats.getDuoWins() + xb1Stats.getDuoWins();
        squadWins = pcStats.getSquadWins() + ps4Stats.getSquadWins() + xb1Stats.getSquadWins();
        soloMinutesPlayed = pcStats.getSoloMinutesPlayed() + ps4Stats.getSoloMinutesPlayed() + xb1Stats.getSoloMinutesPlayed();
        duoMinutesPlayed = pcStats.getDuoMinutesPlayed() + ps4Stats.getDuoMinutesPlayed() + xb1Stats.getDuoMinutesPlayed();
        squadMinutesPlayed = pcStats.getSquadMinutesPlayed() + ps4Stats.getSquadMinutesPlayed() + xb1Stats.getSquadMinutesPlayed();
        soloKills = pcStats.getSoloKills() + ps4Stats.getSoloKills() + xb1Stats.getSoloKills();
        duoKills = pcStats.getDuoKills() + ps4Stats.getDuoKills() + xb1Stats.getDuoKills();
        squadKills = pcStats.getSquadKills() + ps4Stats.getSquadKills() + xb1Stats.getSquadKills();
        squadTop3 = pcStats.getSquadTop3() + ps4Stats.getSquadTop3() + xb1Stats.getSquadTop3();
        squadTop6 = pcStats.getSquadTop6() + ps4Stats.getSquadTop6() + xb1Stats.getSquadTop6();
        duoTop12 = pcStats.getDuoTop12() + ps4Stats.getDuoTop12() + xb1Stats.getDuoTop12();
        duoTop5 = pcStats.getDuoTop5() + ps4Stats.getDuoTop5() + xb1Stats.getDuoTop5();
        soloTop25 = pcStats.getSoloTop25() + ps4Stats.getSoloTop25() + xb1Stats.getSoloTop25();
        soloTop10 = pcStats.getSoloTop10() + ps4Stats.getSoloTop10() + xb1Stats.getSoloTop10();
    }

    @Override
    public double getSoloScore() {
        return soloScore;
    }

    @Override
    public double getDuoScore() {
        return duoScore;
    }

    @Override
    public double getSquadScore() {
        return squadScore;
    }

    @Override
    public double getSoloMatchesPlayed() {
        return soloMatchesPlayed;
    }

    @Override
    public double getDuoMatchesPlayed() {
        return duoMatchesPlayed;
    }

    @Override
    public double getSquadMatchesPlayed() {
        return squadMatchesPlayed;
    }

    @Override
    public long getSoloLastModified() {
        return soloLastModified;
    }

    @Override
    public long getDuoLastModified() {
        return duoLastModified;
    }

    @Override
    public long getSquadLastModified() {
        return squadLastModified;
    }

    @Override
    public double getSoloWins() {
        return soloWins;
    }

    @Override
    public double getDuoWins() {
        return duoWins;
    }

    @Override
    public double getSquadWins() {
        return squadWins;
    }

    @Override
    public double getSoloMinutesPlayed() {
        return soloMinutesPlayed;
    }

    @Override
    public double getDuoMinutesPlayed() {
        return duoMinutesPlayed;
    }

    @Override
    public double getSquadMinutesPlayed() {
        return squadMinutesPlayed;
    }

    @Override
    public double getSoloKills() {
        return soloKills;
    }

    @Override
    public double getDuoKills() {
        return duoKills;
    }

    @Override
    public double getSquadKills() {
        return squadKills;
    }

    @Override
    public double getSquadTop3() {
        return squadTop3;
    }

    @Override
    public double getSquadTop6() {
        return squadTop6;
    }

    @Override
    public double getDuoTop12() {
        return duoTop12;
    }

    @Override
    public double getDuoTop5() {
        return duoTop5;
    }

    @Override
    public double getSoloTop25() {
        return soloTop25;
    }

    @Override
    public double getSoloTop10() {
        return soloTop10;
    }
}
