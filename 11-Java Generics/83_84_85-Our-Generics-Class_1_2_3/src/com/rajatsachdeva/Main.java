package com.rajatsachdeva;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer messi = new SoccerPlayer("Messi");

        //Team teamStark = new Team("Team Stark");
        Team<FootballPlayer> footballPlayerTeam = new Team<>("Football Team");
        // Our team class is allowing us to add any player type to same team
        // There is no actual to see if players being added are of same type
        // Correct way is that only same type of players should be added to
        // a team
        footballPlayerTeam.addPlayer(joe);        // Football player
        System.out.println(footballPlayerTeam.numPlayers());

        // Now following gives an error
        //teamStark.addPlayer(pat);       // BaseBall player
        //teamStark.addPlayer(messi);     // Soccer Player

        Team<BaseballPlayer> baseballPlayerTeam = new Team<>(" Baseball Team");
        baseballPlayerTeam.addPlayer(pat);
        System.out.println(baseballPlayerTeam.numPlayers());

        Team<SoccerPlayer> soccerPlayerTeam = new Team<>(" Soccer Team");
        soccerPlayerTeam.addPlayer(messi);
        System.out.println(soccerPlayerTeam.numPlayers());

        // Now it's still have limitations like we can give any object type for team
        // Now once we have bounded type parameter such that it only extends from Player class
        // Following won't get compiled.
        // Team<String> brokenStringTeam = new Team<>("Broken String Team");
        // brokenStringTeam.addPlayer("No One"); // generates an Exception

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(footballPlayerTeam, 3, 8);

        footballPlayerTeam.matchResult(fremantle, 2, 1);
        // Following is a limitation or bug where we are able to compete between
        // football team and base ball team , which is not correct
        // Now we changed the matchResult opponent Type to Generic Type so
        // that will do strict type safety and hence following won't compile
        //footballPlayerTeam.matchResult(baseballPlayerTeam, 1, 1);

    }
}
