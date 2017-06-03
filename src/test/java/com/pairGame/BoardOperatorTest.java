package com.pairGame;


import org.junit.Before;
import org.junit.Test;

/**
 * Created by acey on 17-6-3.
 */
public class BoardOperatorTest {
    Board board ;
    @Before
    public void setUp() {
        board = new Board(10, 10);
        board.initBoard("1,2 1,3 1,2 5,6 5,7 5,5".split(" "));
    }


}