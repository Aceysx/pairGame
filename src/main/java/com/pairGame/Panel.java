package com.pairGame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by acey on 17-6-3.
 */

public class Panel extends JFrame {

    private int x1 = 0, y1 = 0;
    private int[][] board;

    public void showUI(int[][] board) {
        this.board = board;
        this.setSize(board.length * 30, board[0].length * 30);
        this.setTitle("game");
        FlowLayout flowLayout = new FlowLayout();

        this.setLayout(flowLayout);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setResizable(false);
        this.setVisible(true);

        try {
            Thread.sleep(Constant.INTERVAL_TIME);
        } catch (Exception ef) {
            ef.printStackTrace();
        }
        Graphics g = this.getGraphics();
    }

    public void paint(Graphics g) {
        super.paint(g);
        x1 = 25;
        y1 = 25;
        Color c = g.getColor();
        g.setColor(Color.black);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    g.fillOval(x1, y1, 20, 20);
                }
                y1 += 25;
            }
            x1 += 25;
            y1 = 25;
        }
    }

}