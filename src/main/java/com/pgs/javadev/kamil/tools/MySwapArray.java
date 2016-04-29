package com.pgs.javadev.kamil.tools;

/**
 * Created by kamil on 13.04.16.
 */
public class MySwapArray {
    public static void swap(char[] a, char[] b) {
        int length = a.length;
        char[] temp = new char[length];
        for (char i = 0; i < length; i++) {
            temp[i] = a[i];
            a[i] = b[i];
            b[i] = temp[i];
        }
    }
    public static void swap(int[] a, int[] b) {
        int length = a.length;
        int[] temp = new int[length];
        for (int i = 0; i < length; i++) {
            temp[i] = a[i];
            a[i] = b[i];
            b[i] = temp[i];
        }
    }
}
