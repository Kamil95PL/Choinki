package com.pgs.javadev.kamil.tools;

import org.junit.Test;


import static org.junit.Assert.assertArrayEquals;


/**
 * Created by kamil on 13.04.16.
 */
public class StringToCharTableTest {
    @Test
    public void testConvert() {
        char[][] tree = StringToCharTable.convert("123\n456\n789");
        assertArrayEquals(tree, new char[][]{{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}});
    }
}
