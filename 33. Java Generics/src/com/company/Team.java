package com.company;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> implements Comparable<Team<T>>{

    private String  name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;


    private ArrayList<T> members = new ArrayList<T>();

    public Team(String name) {
        this.name = name;
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){

        String message;

        if (ourScore > theirScore){
            message = " won against ";
            won++;
        } else if (ourScore == theirScore){
            message = " tied against ";
            tied++;
        }else {
            message = " Lost against ";
            lost++;
        }
        played++;
        if (opponent != null){
            System.out.println(this.name + message + opponent.getName());
            opponent.matchResult(null,theirScore, ourScore);
        }
    }

    public String getName() {
        return name;
    }

    public void addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getPlayerName() + " Already on de team");
        } else {
            System.out.println(player.getPlayerName() + " player added to the team " + this.name);
        }
    }

    public  int numPlayers(){
        return this.members.size();
    }

    public int ranking() {
        return (won * 3) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {

        if(this.ranking() > team.ranking()){
            return -1;
        } else if ( this.ranking() < team.ranking()){
            return 1;
        } else {
            return 0;
        }
    }
}
