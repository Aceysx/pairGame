package com.pairGame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by acey on 17-6-3.
 */

    public class Panel extends JFrame {

    private int x1 = 0, x2 = 0, y1 = 0, y2 = 0;

    public void showUI() {

        this.setSize(1000, 1000);

        this.setTitle("game");

        FlowLayout fl = new FlowLayout();

        this.setLayout(fl);

        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setResizable(false);
        this.setVisible(true);

        try {
            Thread.sleep(1000);
        } catch (Exception ef) {
            ef.printStackTrace();
        }
        Graphics g = this.getGraphics();
    }

    public void paint(Graphics g) {
        super.paint(g);

        x1 = 25;

        y1 = 25;

        x2 = x1 + 500;

        for (int i = 0; i < 11; i++) {

            y1 += 25;

            System.out.println("-->");
            Color c = g.getColor();

            g.setColor(Color.black);
            g.fillOval(x1, y1, 20, 20);
        }

        x1 = 25;

        y1 = 25;

        y2 = x1 + 500;

        for (int j = 0; j < 11; j++) {
            Color c = g.getColor();

            g.setColor(Color.black);
            g.fillOval(x1, y1, 20, 20);

            x1 += 25;

        }

    }

}