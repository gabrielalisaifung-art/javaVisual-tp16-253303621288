package com.unpri.charactermanager.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.border.Border;

import com.unpri.charactermanager.model.CharacterType;

public class AppTheme {

    // WARNA
    public static final Color BACKGROUND =
            new Color(245, 247, 250);

    public static final Color PRIMARY =
            new Color(35, 55, 85);

    public static final Color WHITE =
            new Color(255, 255, 255);

    public static final Color GOLD =
            new Color(212, 160, 23);

    public static final Color TEXT =
            new Color(45, 45, 45);

    public static final Color WARRIOR_COLOR =
            new Color(255, 220, 220);

    public static final Color MAGE_COLOR =
            new Color(220, 225, 255);

    public static final Color ARCHER_COLOR =
            new Color(220, 245, 220);

    public static final Color HEALER_COLOR =
            new Color(255, 240, 200);


    // FONT
    public static final Font TITLE_FONT =
            new Font("SansSerif", Font.BOLD, 24);

    public static final Font NORMAL_FONT =
            new Font("SansSerif", Font.PLAIN, 14);

    public static final Font BOLD_FONT =
            new Font("SansSerif", Font.BOLD, 14);


    // BORDER
    public static final Border CARD_BORDER =
            BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(
                    new Color(210, 215, 225), 1
                ),
                BorderFactory.createEmptyBorder(
                    12, 15, 12, 15
                )
            );

    public static final Border MAIN_BORDER =
            BorderFactory.createEmptyBorder(
                20, 20, 20, 20
            );


    // WARNA BERDASARKAN ROLE
    public static Color colorFor(CharacterType type) {

        if (type == null) {
            return WHITE;
        }

        switch (type) {

            case WARRIOR:
                return WARRIOR_COLOR;

            case MAGE:
                return MAGE_COLOR;

            case ARCHER:
                return ARCHER_COLOR;

            case HEALER:
                return HEALER_COLOR;

            default:
                return WHITE;
        }
    }
}
