package com.pairGame;

import java.util.Scanner;

/**
 * Created by acey on 17-6-3.
 */
public class Game {
    private static Scanner scanner = new Scanner(System.in);
    private static String[] points;
    private static String[] boardArea = new String[2];
    private static Board board = null;

    public static void main(String[] args) {
        Board board = initBoard();
        startGame(board);
    }

    private static void startGame(Board board) {
        while (true) {
            BoardOperator.showBoard(board.getCurrBoard());
            board.setCurrBoard(BoardOperator.getNextBoard(board.getCurrBoard()));
            try {
                Thread.sleep(Constant.INTERVAL_TIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static Board initBoard() {
        System.out.println("是(y)否(n)使用默认初始化的坐标");
        if ("y".equals(scanner.nextLine())) {
            board = useDefaultModel();
        } else {
            board = userCustomize();
        }
        System.out.println("请输入需要间隔切换的时间（毫秒）");
        Constant.INTERVAL_TIME = Integer.parseInt(scanner.nextLine());

        return board;
    }

    public static Board useDefaultModel() {
        points = Constant.INIT_POINTS.split(" ");
        boardArea[0] = Constant.INIT_SIZE;
        boardArea[1] = Constant.INIT_SIZE;

        Board board = new Board(Integer.parseInt(boardArea[0].trim()), Integer.parseInt(boardArea[1].trim()));
        board.initBoard(points);

        return board;
    }

    public static Board userCustomize() {
        System.out.println("请输入棋盘大小:(例如：10,10)");
        boardArea = scanner.nextLine().split(",");
        System.out.println("请输入存活的细胞的坐标点，长度小于" + boardArea[0] + ",宽度小于" + boardArea[1] + "输入样例：1,1 2,3 4,5");
        points = scanner.nextLine().split(" ");
        Board board = new Board(Integer.parseInt(boardArea[0].trim()), Integer.parseInt(boardArea[1].trim()));
        board.initBoard(points);

        return board;
    }
}
