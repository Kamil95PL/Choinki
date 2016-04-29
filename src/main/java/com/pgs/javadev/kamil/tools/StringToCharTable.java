package com.pgs.javadev.kamil.tools;

/**
 * Created by kamil on 13.04.16.
 */
public class StringToCharTable {
    public static char[][] convert(String string) {
        int sizeOf1Row = -1;
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == '\n') {
                sizeOf1Row = i;
                break;
            }
        }
        int rowsCount = string.length() / sizeOf1Row;
        char[][] chars = new char[rowsCount][sizeOf1Row];
        int count = 0;
        for (int i = 0; i < rowsCount; i++) {
            for (int j = 0; j < sizeOf1Row; j++) {
                chars[i][j] = string.charAt(count);
                count++;
            }
            count++;
        }
        return chars;
    }
}
