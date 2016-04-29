package com.pgs.javadev.kamil.rotation;

import com.pgs.javadev.kamil.tools.StringToCharTable;

/**
 * Created by kamil on 13.04.16.
 */
public class Rotation90 {
    public static char[][] rotation(char[][] toRotation, Rotation90Direction direction) {
        int numberOfColumns = toRotation[0].length;
        int numberOfRows = toRotation.length;
        char[][] result = new char[numberOfColumns][numberOfRows];
        for (int i = 0; i < numberOfRows; i++) {
            for (int j=0; j<numberOfColumns; j++) {
                if(direction == Rotation90Direction.LEFT) {
                    result[numberOfColumns - 1 - j][i] = toRotation[i][j];
                }
                else {
                    result[j][numberOfRows-1-i] = toRotation[i][j];
                }
            }
        }
        return result;
    }
    public static char[][] rotation(String toRotation, Rotation90Direction direction) {
        return rotation(StringToCharTable.convert(toRotation), direction);
    }
}
