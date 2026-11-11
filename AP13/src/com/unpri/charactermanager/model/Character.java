package com.unpri.charactermanager.model;

public class Character {

    private String name;
    private int level;
    private int mana;
    private CharacterType type;

    public Character(String name, CharacterType type) {
        this(name, 1, 100, type);
    }

    public Character(String name, int level, int mana,
                     CharacterType type) {
        this.name = name;
        this.level = level;
        this.mana = mana;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level < 1) {
            throw new IllegalArgumentException(
                "Level minimal adalah 1"
            );
        }
        this.level = level;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public CharacterType getType() {
        return type;
    }

    public void setType(CharacterType type) {
        this.type = type;
    }

    public void levelUp() {
        level++;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", mana=" + mana +
                ", type=" + type +
                '}';
    }
}