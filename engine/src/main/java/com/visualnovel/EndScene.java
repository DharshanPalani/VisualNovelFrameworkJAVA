package com.visualnovel;

public class EndScene implements Scene {

    private final CharacterRegistry characterRegistry;

    public EndScene(CharacterRegistry registry) {
        this.characterRegistry = registry;
    }

    @Override
    public void Play() {
        characterRegistry.get("Luna").Say("GET OU-");        
        characterRegistry.get("Shiba").Say("Kys");        
    }

}
