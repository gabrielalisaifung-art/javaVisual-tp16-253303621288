package com.unpri.charactermanager;

import javax.swing.SwingUtilities;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.view.MainWindow;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            CharacterManager manager =
                    new CharacterManager();

            manager.addCharacter(
                new Character(
                    "Arthur", 8, 100,
                    CharacterType.WARRIOR
                )
            );

            manager.addCharacter(
                new Character(
                    "Merlin", 10, 150,
                    CharacterType.MAGE
                )
            );

            manager.addCharacter(
                new Character(
                    "Robin", 4, 90,
                    CharacterType.ARCHER
                )
            );

            manager.addCharacter(
                new Character(
                    "Luna", 6, 120,
                    CharacterType.HEALER
                )
            );

            manager.addCharacter(
                new Character(
                    "Leon", 1, 80,
                    CharacterType.WARRIOR
                )
            );

            manager.addCharacter(
                new Character(
                    "Elena", 3, 110,
                    CharacterType.MAGE
                )
            );

            MainWindow window = new MainWindow(
                manager.getAllCharacters()
            );

            window.setVisible(true);
        });
    }
}