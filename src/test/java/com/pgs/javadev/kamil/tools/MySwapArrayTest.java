package com.pgs.javadev.kamil.tools;

import com.pgs.javadev.kamil.tools.MySwapArray;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by kamil on 14.04.16.
 */
public class MySwapArrayTest {
    @Test
    public void testSwap() {
        char[] charsArray1 = {'1', '2', '3'};
        char[] charsArray2 = {'5', '6', '7'};

        char[] oldCharsArray1 = charsArray1;
        char[] oldCharsArray2 = charsArray2;

        MySwapArray.swap(charsArray1, oldCharsArray2);
        assertArrayEquals(charsArray1, oldCharsArray1);
    }
}
