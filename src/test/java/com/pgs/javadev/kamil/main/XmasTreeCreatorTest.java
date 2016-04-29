package com.pgs.javadev.kamil.main;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class XmasTreeCreatorTest {

    XmasTreeCreator xmasTreeCreator;

    @Before
    public void init() {
        xmasTreeCreator = new XmasTreeCreator();
    }
    @Test
    public void testCreateXmasTreeNorth() {
        String tree = xmasTreeCreator.createXmasTree("x", 1, 0, Direction.NORTH);
        assertThat(tree, equalTo("x\n"));

        tree = xmasTreeCreator.createXmasTree("x", 2, 0, Direction.NORTH);
        assertThat(tree, equalTo(
                " x \n" +
                "xxx\n"));

        tree = xmasTreeCreator.createXmasTree("x", 3, 0, Direction.NORTH);
        assertThat(tree, equalTo(
                "  x  \n" +
                " xxx \n" +
                "xxxxx\n"));
    }
    @Test
    public void testCreateXmasTreeSouth() {
//        String tree = xmasTreeCreator.createXmasTree("x", 1, 0, Direction.SOUTH);
//        assertThat(tree, equalTo("x\n"));

        String tree = xmasTreeCreator.createXmasTree("x", 2, 0, Direction.SOUTH);
        assertThat(tree, equalTo(
                "xxx\n" +
                " x \n"));

        tree = xmasTreeCreator.createXmasTree("x", 3, 0, Direction.SOUTH);
        assertThat(tree, equalTo(
                "xxxxx\n" +
                " xxx \n" +
                "  x  \n"));
    }
}
