package com.rajatsachdeva;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer messi = new SoccerPlayer("Messi");

        Team teamStark = new Team("Team Stark");
        // Our team class is allowing us to add any player type to same team
        // There is no actual to see if players being added are of same type
        teamStark.addPlayer(joe); // Football player
        teamStark.addPlayer(pat); // BaseBall player
        teamStark.addPlayer(messi); // Soccer Player

        System.out.println(teamStark.numPlayers());
    }
}
