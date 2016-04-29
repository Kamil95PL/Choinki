package com.pgs.javadev.kamil.rotation;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by kamil on 13.04.16.
 */
public class Rotation90Test {
    @Test
    public void testRotation() {
        char[][] tree = Rotation90.rotation(new char[][]{
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}}, Rotation90Direction.LEFT);
        assertArrayEquals(tree, new char[][]{
                {'3', '6', '9'},
                {'2', '5', '8'},
                {'1', '4', '7'}});

        tree = Rotation90.rotation(new char[][]{
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'a', 'b', 'c'}}, Rotation90Direction.LEFT);
        assertArrayEquals(tree, new char[][]{
                {'3', '6', '9', 'c'},
                {'2', '5', '8', 'b'},
                {'1', '4', '7', 'a'}});
    }
}
