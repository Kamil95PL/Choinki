package com.pgs.javadev.kamil.main;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args) {
        XmasTreeCreator creator =  new XmasTreeCreator();

        System.out.println(creator.createXmasTree("x", 4, 0, Direction.NORTH));
        System.out.println();

        System.out.println(creator.createXmasTree("x", 4, 0, Direction.EAST));
        System.out.println();

        System.out.println(creator.createXmasTree("x", 4, 0, Direction.SOUTH));
        System.out.println();

        System.out.println(creator.createXmasTree("x", 4, 0, Direction.WEST));
    }
}
