package com.pairGame;

/**
 * Created by acey on 17-6-3.
 */
public class BoardOperator {

    public static void showBoard(int[][] board) {
        for (int outterIndex = 1; outterIndex < board.length - 1; ++outterIndex) {
            for (int innerIndex = 1; innerIndex < board[outterIndex].length - 1; ++innerIndex) {
                System.out.print(board[outterIndex][innerIndex] + " ");
            }
            System.out.println();
        }
    }


    public static int[][] boardStateChange(int[][] board) {
        int[][] nextBoard = board;

        for (int outterIndex = 0; outterIndex < board.length; ++outterIndex) {
            for (int innerIndex = 0; innerIndex < board[outterIndex].length; ++innerIndex) {
                nextBoard[outterIndex][innerIndex] = getCurrentState(outterIndex, innerIndex, board);
            }
        }

        return board;
    }

    private static int getCurrentState(int y, int x, int[][] board) {
        int aliveNumber = 0;

        aliveNumber += board[y - 1][x - 1] == 1 ? 1 : 0;
        aliveNumber += board[y - 1][x] == 1 ? 1 : 0;
        aliveNumber += board[y - 1][x + 1] == 1 ? 1 : 0;

        aliveNumber += board[y][x - 1] == 1 ? 1 : 0;
        aliveNumber += board[y][x + 1] == 1 ? 1 : 0;

        aliveNumber += board[y + 1][x - 1] == 1 ? 1 : 0;
        aliveNumber += board[y + 1][x] == 1 ? 1 : 0;
        aliveNumber += board[y + 1][x + 1] == 1 ? 1 : 0;

        if (aliveNumber == 2) return board[y][x];
        if (aliveNumber == 3) return 1;

        return 0;
    }
}
