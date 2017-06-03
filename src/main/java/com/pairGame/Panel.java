package com.pairGame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by acey on 17-6-3.
 */

public class Panel extends JFrame {
    private int x = 0, y = 0;
    private int[][] board;

    public void showBoardUI(int[][] board) {
        this.board = board;
        this.setTitle(Constant.PANEL_TITLE);
        FlowLayout flowLayout = new FlowLayout();
        this.getGraphicsConfiguration().getDevice()
                .setFullScreenWindow(this);
        this.setLayout(flowLayout);
        this.setResizable(false);
        this.setVisible(true);
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        x = Constant.INIT_LOCATION_POINT;
        y = Constant.INIT_LOCATION_POINT;
        graphics.setColor(Color.green);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    graphics.fillOval(x, y, Constant.CHESS_SIZE, Constant.CHESS_SIZE);
                }
                y += Constant.INCREMENT_DISTANCE;
            }
            x += Constant.INCREMENT_DISTANCE;
            y = Constant.INIT_LOCATION_POINT;
        }
    }
}