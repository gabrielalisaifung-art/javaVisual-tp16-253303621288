
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

            // Menambahkan 8 karakter
            manager.addCharacter(
                new Character("Aldric", CharacterType.WARRIOR, 15)
            );

            manager.addCharacter(
                new Character("Lunaria", CharacterType.MAGE, 20)
            );

            manager.addCharacter(
                new Character("Robin", CharacterType.ARCHER, 12)
            );

            manager.addCharacter(
                new Character("Seraphina", CharacterType.HEALER, 18)
            );

            manager.addCharacter(
                new Character("Draven", CharacterType.WARRIOR, 25)
            );

            manager.addCharacter(
                new Character("Elara", CharacterType.MAGE, 30)
            );

            manager.addCharacter(
                new Character("Kael", CharacterType.ARCHER, 10)
            );

            manager.addCharacter(
                new Character("Celestia", CharacterType.HEALER, 22)
            );

            // Membuka aplikasi GUI
            new MainWindow(manager.getAllCharacters());

        });
    }
}
