package com.visualnovel;

public class Character {

    public String name;

    public Character(String name) {
        this.name = name;
    }

    public void Say(String dialogue) {
        System.out.println(name + " : " + dialogue);
    }

    public String getName() {
        return name;
    }

}
