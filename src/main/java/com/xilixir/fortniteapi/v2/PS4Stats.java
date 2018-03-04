package com.xilixir.fortniteapi.v2;

public class PS4Stats extends Stats{
    // epic provided
    private double br_score_ps4_m0_p2;
    private double br_score_ps4_m0_p10;
    private double br_score_ps4_m0_p9;
    private double br_matchesplayed_ps4_m0_p2;
    private double br_matchesplayed_ps4_m0_p10;
    private double br_matchesplayed_ps4_m0_p9;
    private long br_lastmodified_ps4_m0_p2;
    private long br_lastmodified_ps4_m0_p10;
    private long br_lastmodified_ps4_m0_p9;
    private double br_placetop1_ps4_m0_p2;
    private double br_placetop1_ps4_m0_p10;
    private double br_placetop1_ps4_m0_p9;
    private double br_minutesplayed_ps4_m0_p2;
    private double br_minutesplayed_ps4_m0_p10;
    private double br_minutesplayed_ps4_m0_p9;
    private double br_kills_ps4_m0_p2;
    private double br_kills_ps4_m0_p10;
    private double br_kills_ps4_m0_p9;
    private double br_placetop3_ps4_m0_p9;
    private double br_placetop6_ps4_m0_p9;
    private double br_placetop12_ps4_m0_p10;
    private double br_placetop5_ps4_m0_p10;
    private double br_placetop25_ps4_m0_p2;
    private double br_placetop10_ps4_m0_p2;

    public double getSoloScore(){
        return this.br_score_ps4_m0_p2;
    }

    public double getDuoScore(){
        return this.br_score_ps4_m0_p10;
    }

    public double getSquadScore(){
        return this.br_score_ps4_m0_p9;
    }

    public double getSoloMatchesPlayed(){
        return this.br_matchesplayed_ps4_m0_p2;
    }

    public double getDuoMatchesPlayed(){
        return this.br_matchesplayed_ps4_m0_p10;
    }

    public double getSquadMatchesPlayed(){
        return this.br_matchesplayed_ps4_m0_p9;
    }

    public long getSoloLastModified(){
        return this.br_lastmodified_ps4_m0_p2;
    }

    public long getDuoLastModified(){
        return this.br_lastmodified_ps4_m0_p10;
    }

    public long getSquadLastModified(){
        return this.br_lastmodified_ps4_m0_p9;
    }

    public double getSoloWins(){
        return this.br_placetop1_ps4_m0_p2;
    }

    public double getDuoWins(){
        return this.br_placetop1_ps4_m0_p10;
    }

    public double getSquadWins(){
        return this.br_placetop1_ps4_m0_p9;
    }

    public double getSoloMinutesPlayed(){
        return this.br_minutesplayed_ps4_m0_p2;
    }

    public double getDuoMinutesPlayed(){
        return this.br_minutesplayed_ps4_m0_p10;
    }

    public double getSquadMinutesPlayed(){
        return this.br_minutesplayed_ps4_m0_p9;
    }

    public double getSoloKills(){
        return this.br_kills_ps4_m0_p2;
    }

    public double getDuoKills(){
        return this.br_kills_ps4_m0_p10;
    }

    public double getSquadKills(){
        return this.br_kills_ps4_m0_p9;
    }

    public double getSquadTop3(){
        return this.br_placetop3_ps4_m0_p9;
    }

    public double getSquadTop6(){
        return this.br_placetop6_ps4_m0_p9;
    }

    public double getDuoTop12(){
        return this.br_placetop12_ps4_m0_p10;
    }

    public double getDuoTop5(){
        return this.br_placetop5_ps4_m0_p10;
    }

    public double getSoloTop25(){
        return this.br_placetop25_ps4_m0_p2;
    }

    public double getSoloTop10(){
        return this.br_placetop10_ps4_m0_p2;
    }
}
