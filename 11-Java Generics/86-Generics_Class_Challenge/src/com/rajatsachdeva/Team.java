package com.rajatsachdeva;

import java.util.ArrayList;

/**
 * @param <T> Generic Type Parameter
 *           T is a Bounded Type Parameter
 */
// Multiple Bounds: T extends Aclass & Binterface & Cinterface
public class Team<T extends Player> implements Comparable<Team<T>> {

    private String name;
    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            // Not a neat approach to cast ((Player) player).getName()
            // Cast not Required now, T Type is Bounded Type Parameter extending Player class
            //System.out.println(((Player) player).getName() + " is already on this team");
            System.out.println(player.getName() + " is already on this team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    /**
     * @param opponent   This is generic Type so, will only accept same kind of type
     * @param ourScore
     * @param theirScore
     */
    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;

        if (ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if (ourScore == theirScore) {
            tied++;
            message = " drew with ";
        } else {
            lost++;
            message = " lost to ";
        }
        played++;

        if (opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", played=" + played +
                ", won=" + won +
                ", lost=" + lost +
                ", tied=" + tied +
                '}';
    }

    @Override
    public int compareTo(Team<T> team) {

        if (this.ranking() > team.ranking()) {
            return 1;
        } else if (this.ranking() < team.ranking()) {
            return -1;
        }
        return 0;
    }
}

