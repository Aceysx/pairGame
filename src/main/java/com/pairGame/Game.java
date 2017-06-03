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
        System.out.println("请输入存活的细胞的坐标点，长度小于"+reg[0]+",宽度小于"+reg[1]+"输入样例：1,1 2,3 4,5");
        String[] points = scanner.nextLine().split(" ");

        Board board = new Board(Integer.parseInt(reg[0]), Integer.parseInt(reg[1]));
        board.initBoard(points);

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
