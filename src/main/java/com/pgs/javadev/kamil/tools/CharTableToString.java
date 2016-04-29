package com.pgs.javadev.kamil.tools;

/**
 * Created by kamil on 14.04.16.
 */
public class CharTableToString {
    public static String convert(char[][] chars) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char[] charsRow : chars) {
            for (char charek : charsRow) {
                stringBuilder.append(charek);
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
