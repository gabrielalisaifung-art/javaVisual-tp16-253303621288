
package com.unpri.charactermanager.model;

import java.util.ArrayList;
import java.util.List;

public class CharacterManager {

    private final List<Character> characters = new ArrayList<>();

    public void addCharacter(Character character) {
        characters.add(character);
    }

    public List<Character> getCharacters() {
        return new ArrayList<>(characters);
    }
}
