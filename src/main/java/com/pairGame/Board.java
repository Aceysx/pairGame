package com.pairGame;

/**
 * Created by acey on 17-6-3.
 */
public class Board {
    private int length;
    private int width;
    private char[][] currBoard;
    private char[][] nextBoard;

    public Board(int length, int width) {
        this.length = length;
        this.width = width;
        currBoard = new char[length][width];
        nextBoard = new char[length][width];
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

    public char[][] getCurrBoard() {
        return currBoard;
    }

    public void setCurrBoard(char[][] currBoard) {
        this.currBoard = currBoard;
    }

    public char[][] getNextBoard() {
        return nextBoard;
    }

    public void setNextBoard(char[][] nextBoard) {
        this.nextBoard = nextBoard;
    }
}
