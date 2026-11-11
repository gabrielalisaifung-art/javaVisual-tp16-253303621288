
package com.unpri.charactermanager.view;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainWindow extends JFrame {

    private List<Character> characterList;

    private JPanel mainPanel;
    private JPanel headerPanel;
    private JPanel statisticsPanel;
    private JPanel cardPanel;
    private JPanel legendPanel;
    private JPanel statusPanel;

    private JLabel totalLabel;
    private JLabel averageLabel;
    private JLabel highestLabel;
    private JLabel lowestLabel;

   public MainWindow(List<Character> characterList) {

    super("Character Manager v0.5");

    this.characterList = characterList;

    initComponents();

    // Ukuran jendela dikecilkan
    setSize(600, 400);

    setMinimumSize(new Dimension(450, 350));

    setLocationRelativeTo(null);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    setVisible(true);
}

    private void initComponents() {

        // Layout utama
        mainPanel = new JPanel(new BorderLayout(10, 10));

        mainPanel.setBorder(
            BorderFactory.createEmptyBorder(10, 10, 10, 10)
        );

        // =========================
        // NORTH - HEADER
        // =========================

        headerPanel = new JPanel(new BorderLayout(5, 5));

        JLabel titleLabel = new JLabel(
            "CHARACTER MANAGER",
            SwingConstants.CENTER
        );

        titleLabel.setFont(
            titleLabel.getFont().deriveFont(Font.BOLD, 22f)
        );

        headerPanel.add(titleLabel, BorderLayout.NORTH);

        // Panel tambahan: Statistik GridLayout 2x2
        statisticsPanel = new JPanel(new GridLayout(2, 2, 10, 5));

        totalLabel = new JLabel();
        averageLabel = new JLabel();
        highestLabel = new JLabel();
        lowestLabel = new JLabel();

        statisticsPanel.add(totalLabel);
        statisticsPanel.add(averageLabel);
        statisticsPanel.add(highestLabel);
        statisticsPanel.add(lowestLabel);

        updateStatistics();

        headerPanel.add(statisticsPanel, BorderLayout.SOUTH);

        mainPanel.add(headerPanel, BorderLayout.NORTH);

        // =========================
        // CENTER - DAFTAR KARAKTER
        // =========================

        JPanel scrollContent = new JPanel(new BorderLayout());

        cardPanel = new JPanel(
            new GridLayout(0, 2, 10, 10)
        );

        cardPanel.setBorder(
            BorderFactory.createEmptyBorder(5, 5, 5, 5)
        );

        displayCharacters();

        // Kartu dimasukkan ke panel, bukan langsung ke JScrollPane
        scrollContent.add(cardPanel, BorderLayout.NORTH);

        JScrollPane scroll = new JScrollPane(
            scrollContent,
            JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED
        );

        scroll.setPreferredSize(new Dimension(560, 350));

        mainPanel.add(scroll, BorderLayout.CENTER);

        // =========================
        // EAST - LEGENDA
        // =========================

        legendPanel = new JPanel();

        // Target container BoxLayout harus legendPanel
        legendPanel.setLayout(
            new BoxLayout(legendPanel, BoxLayout.Y_AXIS)
        );

        legendPanel.setBorder(
            BorderFactory.createTitledBorder("Legenda Role")
        );

        legendPanel.add(Box.createVerticalStrut(10));

        for (CharacterType type : CharacterType.values()) {

            JLabel roleLabel = new JLabel(
                "  " + type.name()
            );

            roleLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

            legendPanel.add(roleLabel);

            legendPanel.add(Box.createVerticalStrut(12));
        }

        legendPanel.add(Box.createVerticalGlue());

        mainPanel.add(legendPanel, BorderLayout.EAST);

        // =========================
        // SOUTH - STATUS BAR
        // =========================

        statusPanel = new JPanel(new BorderLayout());

        statusPanel.setBorder(
            BorderFactory.createEmptyBorder(5, 5, 5, 5)
        );

        JLabel statusLabel = new JLabel(
            "Status: Aplikasi berhasil dijalankan"
        );

        JLabel versionLabel = new JLabel("v0.5");

        statusPanel.add(statusLabel, BorderLayout.WEST);
        statusPanel.add(versionLabel, BorderLayout.EAST);

        mainPanel.add(statusPanel, BorderLayout.SOUTH);

        // Menambahkan panel utama ke JFrame
        setContentPane(mainPanel);
    }

    // =========================
    // MENAMPILKAN KARTU
    // =========================

    private void displayCharacters() {

        cardPanel.removeAll();

        for (Character character : characterList) {

            JPanel card = new JPanel();

            card.setLayout(
                new BoxLayout(card, BoxLayout.Y_AXIS)
            );

            card.setBorder(
                BorderFactory.createCompoundBorder(
                    BorderFactory.createEtchedBorder(),
                    BorderFactory.createEmptyBorder(10, 10, 10, 10)
                )
            );

            JLabel nameLabel = new JLabel(
                "Nama: " + character.getName()
            );

            JLabel roleLabel = new JLabel(
                "Role: " + character.getType()
            );

            JLabel levelLabel = new JLabel(
                "Level: " + character.getLevel()
            );

            card.add(nameLabel);
            card.add(Box.createVerticalStrut(5));
            card.add(roleLabel);
            card.add(Box.createVerticalStrut(5));
            card.add(levelLabel);

            cardPanel.add(card);
        }

        cardPanel.revalidate();
        cardPanel.repaint();
    }

    // =========================
    // STATISTIK KARAKTER
    // =========================

    private void updateStatistics() {

        int total = characterList.size();

        double average = 0;
        int highest = 0;
        int lowest = 0;

        if (total > 0) {

            int sum = 0;

            highest = Integer.MIN_VALUE;
            lowest = Integer.MAX_VALUE;

            for (Character character : characterList) {

                int level = character.getLevel();

                sum += level;

                if (level > highest) {
                    highest = level;
                }

                if (level < lowest) {
                    lowest = level;
                }
            }

            average = (double) sum / total;
        }

        totalLabel.setText("Total Karakter: " + total);

        averageLabel.setText(
            String.format("Rata-rata Level: %.1f", average)
        );

        highestLabel.setText("Level Tertinggi: " + highest);

        lowestLabel.setText("Level Terendah: " + lowest);
    }
}
