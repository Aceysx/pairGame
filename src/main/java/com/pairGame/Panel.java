package com.pairGame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by acey on 17-6-3.
 */

public class Panel extends JFrame {

    private int x = 0, y = 0;
    private int[][] board;

    public void showUI(int[][] board) {
        this.board = board;
        this.setSize(board.length * Constant.BOX_SIZE, board[0].length * Constant.BOX_SIZE);
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
        x = Constant.INIT_LOCATION_POINT;
        y = Constant.INIT_LOCATION_POINT;
        Color c = g.getColor();
        g.setColor(Color.black);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    g.fillOval(x, y, Constant.CHESS_SIZE, Constant.CHESS_SIZE);
                }
                y += Constant.INCREMENT_DISTANCE;
            }
            x += Constant.INCREMENT_DISTANCE;
            y = Constant.INIT_LOCATION_POINT;
        }
    }

}