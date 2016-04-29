package com.pgs.javadev.kamil.rotation;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by kamil on 14.04.16.
 */
public class Vertical180RotationTest {
    @Test
    public void testRotation() {
        char[][] tree = Vertical180Rotation.rotation(new char[][]{
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}});
        assertArrayEquals(tree, new char[][]{
                {'7', '8', '9'},
                {'4', '5', '6'},
                {'1', '2', '3'}});

        tree = Vertical180Rotation.rotation(new char[][]{
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'a', 'b', 'c'}});
        assertArrayEquals(tree, new char[][]{
                {'a', 'b', 'c'},
                {'7', '8', '9'},
                {'4', '5', '6'},
                {'1', '2', '3'}});
    }
}
