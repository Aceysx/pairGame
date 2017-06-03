package com.pairGame;

import java.util.Scanner;

/**
 * Created by acey on 17-6-3.
 */
public class Game {
    public static void main(String[] args) {
        Board board = initGame();

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

    public static Board initGame() {
        String[] points;
        String[] reg = new String[2];
        Scanner scanner = new Scanner(System.in);

        System.out.println("是(y)否(n)使用默认初始化的坐标");
        if ("y".equals(scanner.nextLine())) {
            points = Constant.INIT_POINTS.split(" ");
            reg[0] = "50";
            reg[1] = "50";
        } else {
            System.out.println("请输入棋盘大小:(例如：10,10)");
            reg = scanner.nextLine().split(",");
            System.out.println("请输入存活的细胞的坐标点，长度小于" + reg[0] + ",宽度小于" + reg[1] + "输入样例：1,1 2,3 4,5");
            points = scanner.nextLine().split(" ");
        }

        System.out.println("请输入需要间隔切换的时间（毫秒）");
        Constant.INTERVAL_TIME = Integer.parseInt(scanner.nextLine());

        Board board = new Board(Integer.parseInt(reg[0].trim()), Integer.parseInt(reg[1].trim()));
        board.initBoard(points);

        return board;
    }
}
