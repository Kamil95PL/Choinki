package com.pgs.javadev.kamil.rotation;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by kamil on 14.04.16.
 */
public class Horizontal180RotationTest {
    @Test
    public void testRotation() {
        char[][] tree = Horizontal180Rotation.rotation(new char[][]{
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}});
        assertArrayEquals(tree, new char[][]{
                {'3', '2', '1'},
                {'6', '5', '4'},
                {'9', '8', '7'}});

        tree = Horizontal180Rotation.rotation(new char[][]{
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'a', 'b', 'c'}});
        assertArrayEquals(tree, new char[][]{
                {'3', '2', '1'},
                {'6', '5', '4'},
                {'9', '8', '7'},
                {'c', 'b', 'a'}});
    }
}
