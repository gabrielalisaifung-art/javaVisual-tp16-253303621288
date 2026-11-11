
package com.unpri.charactermanager.model;

public class Character {

    private String name;
    private CharacterType type;
    private int level;

    public Character(String name, CharacterType type, int level) {
        this.name = name;
        this.type = type;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public CharacterType getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }
}
