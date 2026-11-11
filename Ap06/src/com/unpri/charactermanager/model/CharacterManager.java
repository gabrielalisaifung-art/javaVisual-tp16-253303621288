import java.util.ArrayList;

public class CharacterManager {
    private ArrayList<Character> characters;

    public CharacterManager() {
        characters = new ArrayList<>();
    }

    public void addCharacter(Character character) {
        characters.add(character);
    }

    public ArrayList<Character> getAllCharacters() {
        return new ArrayList<>(characters);
    }

    public int getTotalCharacters() {
        return characters.size();
    }
}