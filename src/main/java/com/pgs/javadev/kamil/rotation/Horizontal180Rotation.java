package com.pgs.javadev.kamil.rotation;

import com.pgs.javadev.kamil.tools.StringToCharTable;

/**
 * Created by kamil on 13.04.16.
 */
public class Horizontal180Rotation {
    public static char[][] rotation(char[][] toRotation) {
        int numberOfColumns = toRotation[0].length;
        int numberOfRows = toRotation.length;
        for (int j = 0; j < numberOfRows; j++) {
            for (int i=0; i<numberOfColumns/2; i++) {
                char temp = toRotation[j][i];
                toRotation[j][i] = toRotation[j][numberOfColumns - i - 1];
                toRotation[j][numberOfColumns - i - 1] = temp;
            }
        }
        return toRotation;
    }
    public static char[][] rotation(String toRotationString) {
        return rotation(StringToCharTable.convert(toRotationString));
    }
}
