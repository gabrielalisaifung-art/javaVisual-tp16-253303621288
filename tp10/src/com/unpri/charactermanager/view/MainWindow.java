
package com.unpri.charactermanager.view;

import com.unpri.charactermanager.model.Character;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainWindow extends JFrame {

    private final List<Character> characterList;

    public MainWindow(List<Character> characterList) {
        this.characterList = characterList;

        setTitle("Character Manager - TP8");
        setSize(420, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initComponents();
    }

    private void initComponents() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(
            BorderFactory.createEmptyBorder(20, 20, 20, 20)
        );

        JLabel titleLabel = new JLabel("Daftar Karakter");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        mainPanel.add(titleLabel);

        mainPanel.add(Box.createVerticalStrut(15));

        // Menampilkan karakter secara dinamis menggunakan loop.
        for (Character c : characterList) {
            JLabel characterLabel = new JLabel(
                c.getName() + " | Tipe: " + c.getType()
                + " | Level: " + c.getLevel()
            );

            characterLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            characterLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

            mainPanel.add(characterLabel);
            mainPanel.add(Box.createVerticalStrut(8));
        }

        // Menghitung total level karakter.
        int totalLevel = 0;

        for (Character c : characterList) {
            totalLevel += c.getLevel();
        }

        // Menghitung rata-rata secara otomatis.
        double averageLevel = characterList.isEmpty()
                ? 0.0
                : (double) totalLevel / characterList.size();

        mainPanel.add(Box.createVerticalStrut(10));

        JSeparator separator = new JSeparator();
        separator.setMaximumSize(
            new Dimension(Integer.MAX_VALUE, 1)
        );
        mainPanel.add(separator);

        mainPanel.add(Box.createVerticalStrut(10));

        JLabel averageLabel = new JLabel(
            String.format("Rata-rata Level: %.1f", averageLevel)
        );

        averageLabel.setFont(new Font("Arial", Font.BOLD, 16));
        averageLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        mainPanel.add(averageLabel);

        add(mainPanel);
    }
}

