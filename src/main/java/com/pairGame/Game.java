package com.pairGame;

import java.util.Scanner;

/**
 * Created by acey on 17-6-3.
 */
public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入棋盘大小:(例如：10,10)");
        String[] reg = scanner.nextLine().split(",");

        Board board = new Board(Integer.parseInt(reg[0]), Integer.parseInt(reg[1]));

        while (true) {
            BoardOperator.showBoard(board.getCurrBoard());
            board.setCurrBoard(BoardOperator.boardStateChange(board.getCurrBoard()));
            System.out.println();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
