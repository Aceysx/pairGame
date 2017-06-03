package com.pairGame;

/**
 * Created by acey on 17-6-3.
 */
public class Board {
    private int length;
    private int width;
    private int[][] currBoard;

    public Board(int length, int width) {
        this.length = length;
        this.width = width;
        currBoard = new int[length + 2][width + 2];

        currBoard[3][2] = 1;
        currBoard[3][3] = 1;
        currBoard[3][4] = 1;
    }


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int[][] getCurrBoard() {
        return currBoard;
    }

    public void setCurrBoard(int[][] currBoard) {
        this.currBoard = currBoard;
    }

}
