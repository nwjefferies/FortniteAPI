package com.xilixir.fortniteapi.v2;

public abstract class Stats {
	// calculated
    private double soloKillDeathRatio;
    private double duoKillDeathRatio;
    private double squadKillDeathRatio;
    private double soloWinRatio;
    private double duoWinRatio;
    private double squadWinRatio;
    private double soloKillsPerMinute;
    private double squadKillsPerMinute;
    private double soloKillsPerMatch;
    private double duoKillsPerMinute;
    private double duoKillsPerMatch;
    private double squadKillsPerMatch;
    private double totalMatchesPlayed;
    private double totalLastModified;
    private double totalWins;
    private double totalMinutesPlayed;
    private double totalKills;
    private double totalKillDeathRatio;
    private double totalWinRatio;
    private double totalKillsPerMinute;
    private double totalKillsPerMatch;
	
	// calculate stats
	void calculate(){
        // kills/death
        this.soloKillDeathRatio = this.getSoloKills()/((this.getSoloMatchesPlayed() - this.getSoloWins()) > 0 ? (this.getSoloMatchesPlayed() - this.getSoloWins()) : 1);
        this.duoKillDeathRatio = this.getDuoKills()/((this.getDuoMatchesPlayed() - this.getDuoWins()) > 0 ? (this.getDuoMatchesPlayed() - this.getDuoWins()) : 1);
        this.squadKillDeathRatio = this.getSquadKills()/((this.getSquadMatchesPlayed() - this.getSquadWins()) > 0 ? (this.getSquadMatchesPlayed() - this.getSquadWins()) : 1);

        // winrate
        this.soloWinRatio = (this.getSoloWins()/(this.getSoloMatchesPlayed() > 0 ? this.getSoloMatchesPlayed() : 1)) * 100;
        this.duoWinRatio = (this.getDuoWins()/(this.getDuoMatchesPlayed() > 0 ? this.getDuoMatchesPlayed() : 1)) * 100;
        this.squadWinRatio = (this.getSquadWins()/(this.getSquadMatchesPlayed() > 0 ? this.getSquadMatchesPlayed() : 1)) * 100;

        // kills/minute
        this.soloKillsPerMinute = this.getSoloKills()/(this.getSoloMinutesPlayed() > 0 ? this.getSoloMinutesPlayed() : 1);
        this.duoKillsPerMinute = this.getDuoKills()/(this.getDuoMinutesPlayed() > 0 ? this.getDuoMinutesPlayed() : 1);
        this.squadKillsPerMinute = this.getSquadKills()/(this.getSquadMinutesPlayed() > 0 ? this.getSquadMinutesPlayed() : 1);

        // kills/match
        this.soloKillsPerMatch = this.getSoloKills()/(this.getSoloMatchesPlayed() > 0 ? this.getSoloMatchesPlayed() : 1);
        this.duoKillsPerMatch = this.getDuoKills()/(this.getDuoMatchesPlayed() > 0 ? this.getDuoMatchesPlayed() : 1);
        this.squadKillsPerMatch = this.getSquadKills()/(this.getSquadMatchesPlayed()> 0 ? this.getSquadMatchesPlayed(): 1);

        // total
        this.totalMatchesPlayed = this.getSoloMatchesPlayed() + this.getDuoMatchesPlayed() + this.getSquadMatchesPlayed();
        this.totalLastModified = this.getSoloLastModified();
        if (this.totalLastModified < this.getDuoLastModified()){
            this.totalLastModified = this.getDuoLastModified();
        } else if (this.totalLastModified < this.getSquadLastModified()){
            this.totalLastModified = this.getSquadLastModified();
        }
        this.totalWins = this.getSoloWins() + this.getDuoWins() + this.getSquadWins();
        this.totalMinutesPlayed = this.getSoloMinutesPlayed() + this.getDuoMinutesPlayed() + this.getSquadMinutesPlayed();
        this.totalKills = this.getSoloKills() + this.getDuoKills() + this.getSquadKills();
        this.totalKillDeathRatio = this.totalKills/((this.totalMatchesPlayed - this.totalWins) > 0 ? (this.totalMatchesPlayed - this.totalWins) : 1);
        this.totalWinRatio = (this.totalWins/(this.totalMatchesPlayed > 0 ? this.totalMatchesPlayed : 1)) * 100;
        this.totalKillsPerMinute = this.totalKills/(this.totalMinutesPlayed > 0 ? this.totalMinutesPlayed : 1);
        this.totalKillsPerMatch = this.totalKills/(this.totalMatchesPlayed > 0 ? this.totalMatchesPlayed : 1);
    }
	
	public double getSoloKillDeathRatio() {
        return soloKillDeathRatio;
    }

    public double getDuoKillDeathRatio() {
        return duoKillDeathRatio;
    }

    public double getSquadKillDeathRatio() {
        return squadKillDeathRatio;
    }

    public double getSoloWinRatio() {
        return soloWinRatio;
    }

    public double getDuoWinRatio() {
        return duoWinRatio;
    }

    public double getSquadWinRatio() {
        return squadWinRatio;
    }

    public double getSoloKillsPerMinute() {
        return soloKillsPerMinute;
    }

    public double getDuoKillsPerMinute() {
        return duoKillsPerMinute;
    }

    public double getSquadKillsPerMinute() {
        return squadKillsPerMinute;
    }

    public double getSoloKillsPerMatch() {
        return soloKillsPerMatch;
    }

    public double getDuoKillsPerMatch() {
        return duoKillsPerMatch;
    }

    public double getSquadKillsPerMatch() {
        return squadKillsPerMatch;
    }

    public double getTotalMatchesPlayed() {
        return totalMatchesPlayed;
    }

    public double getTotalLastModified() {
        return totalLastModified;
    }

    public double getTotalWins() {
        return totalWins;
    }

    public double getTotalMinutesPlayed() {
        return totalMinutesPlayed;
    }

    public double getTotalKills() {
        return totalKills;
    }

    public double getTotalKillDeathRatio() {
        return totalKillDeathRatio;
    }

    public double getTotalWinRatio() {
        return totalWinRatio;
    }

    public double getTotalKillsPerMinute() {
        return totalKillsPerMinute;
    }

    public double getTotalKillsPerMatch() {
        return totalKillsPerMatch;
    }
	
    public abstract double getSoloScore();
    public abstract double getDuoScore();
    public abstract double getSquadScore();
    public abstract double getSoloMatchesPlayed();
    public abstract double getDuoMatchesPlayed();
    public abstract double getSquadMatchesPlayed();
    public abstract long getSoloLastModified();
    public abstract long getDuoLastModified();
    public abstract long getSquadLastModified();
    public abstract double getSoloWins();
    public abstract double getDuoWins();
    public abstract double getSquadWins();
    public abstract double getSoloMinutesPlayed();
    public abstract double getDuoMinutesPlayed();
    public abstract double getSquadMinutesPlayed();
    public abstract double getSoloKills();
    public abstract double getDuoKills();
    public abstract double getSquadKills();
    public abstract double getSquadTop3();
    public abstract double getSquadTop6();
    public abstract double getDuoTop12();
    public abstract double getDuoTop5();
    public abstract double getSoloTop25();
    public abstract double getSoloTop10();
}
