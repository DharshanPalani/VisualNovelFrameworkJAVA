package com.visualnovel;

import java.util.HashMap;
import java.util.Map;

public class CharacterRegistry {
    private final Map<String, Character> registeredCharacters = new HashMap<>();

    public void add(Character characterToAdd) {
        registeredCharacters.put(characterToAdd.getName(), characterToAdd);
    }

    public Character get(String characterNameToGet) {
        Character characterToReturn = registeredCharacters.get(characterNameToGet);

        if(characterNameToGet == null) {
            throw new IllegalArgumentException("Character not found: " + characterNameToGet);
        }

        return characterToReturn;
    }
}
