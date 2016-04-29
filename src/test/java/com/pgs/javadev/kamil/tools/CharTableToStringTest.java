package com.pgs.javadev.kamil.tools;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by kamil on 14.04.16.
 */
public class CharTableToStringTest {
    @Test
    public void testConvert() {
        String string = CharTableToString.convert(new char[][]{{'1', '2', '3'}, {'4', '5', '6'}});
        assertThat(string, equalTo("123\n456\n"));
    }
}
