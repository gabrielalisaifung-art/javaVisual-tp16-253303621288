
package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.view.MainWindow;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            CharacterManager manager = new CharacterManager();

            // Tiga karakter awal.
            manager.addCharacter(
                new Character("Archer", CharacterType.ARCHER, 10)
            );

            manager.addCharacter(
                new Character("Warrior", CharacterType.WARRIOR, 20)
            );

            manager.addCharacter(
                new Character("Mage", CharacterType.MAGE, 30)
            );

            // Dua karakter baru untuk TP8.
            manager.addCharacter(
                new Character("Healer", CharacterType.HEALER, 40)
            );

            manager.addCharacter(
                new Character("Paladin", CharacterType.WARRIOR, 50)
            );

            // Menampilkan jendela menggunakan data dari manager.
            MainWindow window =
                new MainWindow(manager.getCharacters());

            window.setVisible(true);
        });
    }
}

