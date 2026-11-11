package com.unpri.charactermanager.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.unpri.charactermanager.model.Character;

public class MainWindow extends JFrame {

    private JPanel mainPanel;
    private JPanel characterPanel;

    public MainWindow(List<Character> characters) {

        setTitle("Character Manager - TP10 v0.3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel(new BorderLayout(15, 15));

        mainPanel.setBorder(
            javax.swing.BorderFactory.createEmptyBorder(
                20, 20, 20, 20
            )
        );

        createComponents(characters);

        setContentPane(mainPanel);

        pack();
        setLocationRelativeTo(null);
    }

    private void createComponents(List<Character> characters) {

        JLabel title = new JLabel(
            "CHARACTER MANAGER",
            SwingConstants.CENTER
        );

        title.setFont(
            new java.awt.Font("SansSerif", java.awt.Font.BOLD, 22)
        );

        mainPanel.add(title, BorderLayout.NORTH);

        characterPanel = new JPanel(
            new GridLayout(0, 2, 12, 12)
        );

        for (Character character : characters) {

            characterPanel.add(
                createCharacterCard(character)
            );
        }

        mainPanel.add(characterPanel, BorderLayout.CENTER);

        JLabel statistic = new JLabel(
            "Total Karakter: " + characters.size(),
            SwingConstants.CENTER
        );

        JPanel footer = new JPanel(new FlowLayout());

        footer.add(statistic);

        mainPanel.add(footer, BorderLayout.SOUTH);
    }

    private JPanel createCharacterCard(Character character) {

        JPanel card = new JPanel(
            new GridLayout(0, 1, 5, 5)
        );

        card.setBorder(
            javax.swing.BorderFactory.createLineBorder(
                java.awt.Color.GRAY
            )
        );

        JLabel name = new JLabel(
            "Nama: " + character.getName()
        );

        JLabel role = new JLabel(
            "Role: " + character.getType()
        );

        JLabel level = new JLabel(
            "Level: " + character.getLevel()
        );

        card.add(name);
        card.add(role);
        card.add(level);

        return card;
    }
}