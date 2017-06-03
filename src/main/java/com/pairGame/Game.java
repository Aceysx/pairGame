package com.pairGame;

/**
 * Created by acey on 17-6-3.
 */
public class Game {
    public static void main(String[] args) throws InterruptedException {
        Board board = new Board(5, 5);

        while (true) {
            BoardOperator.showBoard(board.getCurrBoard());
            board.setCurrBoard(BoardOperator.boardStateChange(board.getCurrBoard()));
            System.out.println();
            Thread.sleep(1000);
        }
    }
}
