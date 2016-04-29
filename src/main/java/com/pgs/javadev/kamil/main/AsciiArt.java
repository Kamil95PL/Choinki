package com.pgs.javadev.kamil.main;

import com.pgs.javadev.kamil.rotation.Rotation90Direction;
import com.pgs.javadev.kamil.rotation.Rotation90;
import com.pgs.javadev.kamil.rotation.Vertical180Rotation;
import com.pgs.javadev.kamil.tools.CharTableToString;

/**
 * Created by kamil on 14.04.16.
 */
public abstract class AsciiArt {
    protected String rotation(Direction direction, String tree) {
        String rotationTree = "";
        switch (direction) {
            case SOUTH:
                rotationTree = CharTableToString.convert(Vertical180Rotation.rotation(tree));
                break;
            case WEST:
                rotationTree = CharTableToString.convert(Rotation90.rotation(tree, Rotation90Direction.LEFT));
                break;
            case EAST:
                rotationTree = CharTableToString.convert(Rotation90.rotation(tree, Rotation90Direction.RIGHT));
                break;
        }
        return rotationTree;
    }
}
