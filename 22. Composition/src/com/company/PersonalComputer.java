package com.company;

public class PersonalComputer {

    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PersonalComputer(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        //Fancy animation
        monitor.drawPixelAt(150,100,"Red");
    }



}
