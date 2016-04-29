package com.pgs.javadev.kamil.rotation;

import com.pgs.javadev.kamil.tools.MySwapArray;
import com.pgs.javadev.kamil.tools.StringToCharTable;

/**
 * Created by kamil on 13.04.16.
 */
public class Vertical180Rotation {
    public static char[][] rotation(char[][] toRotation) {
        int numberOfRows = toRotation.length;
        for (int i=0; i<numberOfRows/2; i++) {
            MySwapArray.swap(toRotation[i], toRotation[numberOfRows - i - 1]);
        }
        return toRotation;
    }
    public static char[][] rotation(String toRotationString) {
        return rotation(StringToCharTable.convert(toRotationString));
    }
}
