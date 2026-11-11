
package com.unpri.charactermanager.model;

import java.util.ArrayList;
import java.util.List;

public class CharacterManager {

    private List<Character> characterList;

    // Constructor
    public CharacterManager() {
        characterList = new ArrayList<>();
    }

    // Menambahkan karakter
    public void addCharacter(Character character) {

        if (character == null) {
            return;
        }

        if (!characterList.contains(character)) {
            characterList.add(character);
        }
    }

    // Mencari karakter berdasarkan nama
    public Character findByName(String name) {

        for (Character character : characterList) {

            if (character.getName().equalsIgnoreCase(name)) {
                return character;
            }
        }

        return null;
    }

    // Menghapus karakter berdasarkan nama
    public boolean removeCharacter(String name) {

        Character character = findByName(name);

        if (character != null) {
            characterList.remove(character);
            return true;
        }

        return false;
    }

    // Menghitung jumlah karakter
    public int getTotalCharacters() {
        return characterList.size();
    }

    // Mengambil seluruh karakter
    public List<Character> getAllCharacters() {
        return new ArrayList<>(characterList);
    }

    // Menghitung rata-rata level
    public double getAverageLevel() {

        if (characterList.isEmpty()) {
            return 0;
        }

        int totalLevel = 0;

        for (Character character : characterList) {
            totalLevel += character.getLevel();
        }

        return (double) totalLevel / characterList.size();
    }

    // Mencari karakter berdasarkan tipe
    public List<Character> findByType(CharacterType type) {

        List<Character> result = new ArrayList<>();

        for (Character character : characterList) {

            if (character.getType() == type) {
                result.add(character);
            }
        }

        return result;
    }
}
