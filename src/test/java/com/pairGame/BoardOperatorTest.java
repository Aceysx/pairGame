package com.pairGame;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by acey on 17-6-3.
 */
public class BoardOperatorTest {
    private Board board;

    @Before
    public void setUp() {
        board = new Board(5, 5);
        board.initBoard("3,2 3,1 3,3".split(" "));
    }

    @Test
    public void testBoardStateChange() {
        int[][] except = new int[7][7];
        except[2][2] = 1;
        except[3][2] = 1;
        except[4][2] = 1;

        int[][] actual = BoardOperator.getNextBoard(board.getCurrBoard());
        Assert.assertArrayEquals(except, actual);
    }

    @Test
    public void testGetAliveNumber() {
        int[] expect = {3, 0, 2};
        int[] actual = new int[3];

        actual[0] = BoardOperator.getAliveNumber(2, 2, board.getCurrBoard());
        actual[1] = BoardOperator.getAliveNumber(1, 1, board.getCurrBoard());
        actual[2] = BoardOperator.getAliveNumber(2, 3, board.getCurrBoard());

        Assert.assertArrayEquals(expect, actual);
    }

}