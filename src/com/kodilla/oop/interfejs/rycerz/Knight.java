package com.kodilla.oop.interfejs.rycerz;

public class Knight {

    private Quest quest;

    public Knight(Quest quest){
        this.quest = quest;
    }

    public void toAction(){
        this.quest.process();
    }
}
