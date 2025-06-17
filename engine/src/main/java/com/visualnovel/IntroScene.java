package com.visualnovel;

public class IntroScene implements Scene {

    private final CharacterRegistry characterRegistry;

    public IntroScene(CharacterRegistry registry) {
        this.characterRegistry = registry;
    }

    @Override
    public void Play() {
        characterRegistry.get("Luna").Say("Just why are you still alive...");        
        characterRegistry.get("Shiba").Say("It's because you were the one who saved me back then.");        
        characterRegistry.get("Luna").Say("Yeah I know but like how are you still alive despite being this dumb.");        
    }

}
