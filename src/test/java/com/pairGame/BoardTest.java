package com.pairGame;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by acey on 17-6-3.
 */
public class BoardTest {
    private Board board;

    @Before
    public void setUp() {
        board = new Board(5, 5);
        board.initBoard("3,2 3,1 3,3".split(" "));
    }

    @Test
    public void testInitBoard() {
        int[][] expect = new int[7][7];
        expect[3][2] = 1;
        expect[3][1] = 1;
        expect[3][3] = 1;

        board.initBoard("3,2 3,1 3,3".split(" "));
        Assert.assertArrayEquals(expect,board.getCurrBoard());
    }
}
