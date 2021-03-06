package com.pairGame;

/**
 * Created by acey on 17-6-3.
 */
public class Board {
    private int length = 0;
    private int width = 0;
    private int[][] currBoard;

    public Board(int length, int width) {
        this.length = length;
        this.width = width;
        currBoard = new int[length + 2][width + 2];
    }

    public void initBoard(String[] points) {
        for (String str : points) {
            currBoard[Integer.parseInt(str.split(",")[0])][Integer.parseInt(str.split(",")[1])] = 1;
        }
    }

    public int[][] getCurrBoard() {
        return currBoard;
    }

    public void setCurrBoard(int[][] currBoard) {
        this.currBoard = currBoard;
    }

}
