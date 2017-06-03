package com.pairGame;

/**
 * Created by acey on 17-6-3.
 */
public class BoardOperator {
    private static Panel panel = new Panel();

    public static void showBoard(int[][] board) {
        panel.showBoardUI(board);
        panel.paint(panel.getGraphics());
    }

    public static int[][] getNextBoard(int[][] board) {
        int[][] nextBoard = new int[board.length][board[0].length];

        for (int outerIndex = 1; outerIndex < board.length - 1; ++outerIndex) {
            for (int innerIndex = 1; innerIndex < board[outerIndex].length - 1; ++innerIndex) {
                int aliveNumber = getAliveNumber(outerIndex, innerIndex, board);
                nextBoard[outerIndex][innerIndex] = getCurrentState(outerIndex, innerIndex, board, aliveNumber);
            }
        }

        return nextBoard;
    }

    public static int getCurrentState(int y, int x, int[][] board, int aliveNumber) {
        if (aliveNumber == Constant.NO_CHANGE_NUMBER) return board[y][x];
        if (aliveNumber == Constant.ALIVE_NUMBER) return 1;
        return 0;
    }

    public static int getAliveNumber(int y, int x, int[][] board) {
        int aliveNumber = 0;

        aliveNumber += board[y - 1][x - 1] == 1 ? 1 : 0;
        aliveNumber += board[y - 1][x] == 1 ? 1 : 0;
        aliveNumber += board[y - 1][x + 1] == 1 ? 1 : 0;

        aliveNumber += board[y][x - 1] == 1 ? 1 : 0;
        aliveNumber += board[y][x + 1] == 1 ? 1 : 0;

        aliveNumber += board[y + 1][x - 1] == 1 ? 1 : 0;
        aliveNumber += board[y + 1][x] == 1 ? 1 : 0;
        aliveNumber += board[y + 1][x + 1] == 1 ? 1 : 0;

        return aliveNumber;
    }
}
