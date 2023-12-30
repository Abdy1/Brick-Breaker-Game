package com.abdydidit;

import javax.swing.*;
import java.awt.*;

public class Game {
    public static void main(String[] args) {
        Integer scoreNumber = 103;
        JFrame frame = new JFrame("Brick Breaker");

        //score area
        JPanel scoreBoard = new JPanel(new FlowLayout(FlowLayout.LEFT));
        scoreBoard.setBackground(Color.GRAY);
        scoreBoard.setPreferredSize(new Dimension(1000,50));
        JLabel score = new JLabel("Score " + scoreNumber, SwingConstants.LEFT);
        score.setHorizontalAlignment(JLabel.LEFT);
        scoreBoard.add(score);


        frame.getContentPane().add(scoreBoard,BorderLayout.NORTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);
        frame.setVisible(true);
        frame.setLocation(500,200);

    }
}
