package org.example;

import java.util.Random;

public class ComparableRectangle extends Rectangle implements Comparable<Rectangle> {
    public ComparableRectangle() {
    }

    public ComparableRectangle(double width, double height) {
        super(width, height);
    }

    public ComparableRectangle(String color, boolean filled, double width, double height) {
        super(color, filled, width, height);
    }

    @Override
    public int compareTo(Rectangle o) {
        if (getArea() > o.getArea()) {
            return 1;
        } else if (getArea() < o.getArea()) {
            return -1;
        } else return 1;
    }
}
