package com.pgs.javadev.kamil.main;

public class XmasTreeCreator extends AsciiArt {
    public String createXmasTree(String text, int levels, int hole, Direction direction) {
        String tree = tree(text, levels, hole);
        if(direction != Direction.NORTH) {
            tree = rotation(direction, tree);
        }
        return tree;
    }
    private String tree(String text, int levels, int hole) {
        StringBuilder tree = new StringBuilder();
        int maxLength = 2*levels-1;
        for (int actualLevel = levels-1; actualLevel >= 0; actualLevel--) {
            tree
                .append(generateSpace(actualLevel))
                .append(generateLayer(text, actualLevel, maxLength))
                .append(generateSpace(actualLevel))
                .append(generateHole(hole));
        }
        return tree.toString();
    }
    private String generateSpace(int levels) {
        StringBuilder space = new StringBuilder();
        for (int i = 0; i < levels; i++) {
            space.append(" ");
        }
        return space.toString();
    }
    private String generateLayer(String text, int actualLevel, int maxLength) {
        StringBuilder layer = new StringBuilder();
        for (int i = 0; i < maxLength-actualLevel*2; i++) {
            layer.append(text);
        }
        return layer.toString();
    }
    private String generateHole(int holeSize) {
        StringBuilder hole = new StringBuilder();
        for (int i = 0; i < holeSize+1; i++) {
            hole.append("\n");
        }
        return hole.toString();
    }
}
