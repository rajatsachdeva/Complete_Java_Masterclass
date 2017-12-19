package com.rajatsachdeva;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer messi = new SoccerPlayer("messi");

        Team teamStark = new Team("Team Stark");
        teamStark.addPlayer(joe);
        teamStark.addPlayer(pat);
        teamStark.addPlayer(messi);

        System.out.println(teamStark.numPlayers());

    }
}
