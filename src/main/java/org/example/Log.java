package org.example;

import java.util.Date;

public class Log {
    private Date Datum;
    private int Id;
    private int Kapazitat;
    private String Spielort;
    private String Team1;
    private String Team2;

    public Log(Date datum, int id, int kapazitat, String spielort, String team1, String team2) {
        Datum = datum;
        Id = id;
        Kapazitat = kapazitat;
        Spielort = spielort;
        Team1 = team1;
        Team2 = team2;
    }

    public Date getDatum() {
        return Datum;
    }

    public void setDatum(Date datum) {
        Datum = datum;
    }

    @Override
    public String toString() {
        return "Log{" +
                "Datum='" + Datum + '\'' +
                ", Id=" + Id +
                ", Kapazitat=" + Kapazitat +
                ", Spielort='" + Spielort + '\'' +
                ", Team1='" + Team1 + '\'' +
                ", Team2='" + Team2 + '\'' +
                '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getKapazitat() {
        return Kapazitat;
    }

    public void setKapazitat(int kapazitat) {
        Kapazitat = kapazitat;
    }

    public String getSpielort() {
        return Spielort;
    }

    public void setSpielort(String spielort) {
        Spielort = spielort;
    }

    public String getTeam1() {
        return Team1;
    }

    public void setTeam1(String team1) {
        Team1 = team1;
    }

    public String getTeam2() {
        return Team2;
    }

    public void setTeam2(String team2) {
        Team2 = team2;
    }
}
