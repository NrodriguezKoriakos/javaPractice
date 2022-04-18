package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        FootBallPlayer joe = new FootBallPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");


        Team<FootBallPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        //adelaideCrows.addPlayer(joe);
        adelaideCrows.addPlayer(joe);
        adelaideCrows.addPlayer(joe);
        //adelaideCrows.addPlayer(pat);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> newYorkYankees = new Team<>("New York Yankees");
        Team<SoccerPlayer> manchesterUnited = new Team<>("Manchester United");
        Team<SoccerPlayer> realMadrid = new Team<>("Real Madrid");
        Team<SoccerPlayer> fcBarcelona = new Team<>("FC Barcelona");
        Team<SoccerPlayer> chelsea = new Team<>("FC Chelsea");
        newYorkYankees.addPlayer(pat);
        manchesterUnited.addPlayer(beckham);

        manchesterUnited.matchResult(realMadrid,4,1);
        fcBarcelona.matchResult(realMadrid,5,3);
        chelsea.matchResult(fcBarcelona,3,1);
        chelsea.matchResult(realMadrid,3,2);

        System.out.println(manchesterUnited.compareTo(realMadrid));
        System.out.println(manchesterUnited.compareTo(fcBarcelona));
        System.out.println(manchesterUnited.compareTo(chelsea));

        ArrayList<Team<SoccerPlayer>> teams;
//        Collections.sort(teams);
    }
}
