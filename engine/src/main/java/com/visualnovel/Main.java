package com.visualnovel;

public class Main {    
    public static void main(String[] args) {
        CharacterRegistry characterRegistry = new CharacterRegistry();

        characterRegistry.add(new Character("Luna"));
        characterRegistry.add(new Character("Shiba"));

        Engine.registerScene("intro", new IntroScene(characterRegistry));

        Engine.runScene("intro");
    }
}