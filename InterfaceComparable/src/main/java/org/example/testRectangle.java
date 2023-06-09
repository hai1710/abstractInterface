package org.example;

import java.util.Arrays;

public class testRectangle {
    public static void main(String[] args) {
        ComparableRectangle[] rectangles = new ComparableRectangle[3];
        rectangles[1] = new ComparableRectangle(7, 4);
        rectangles[0] = new ComparableRectangle();
        rectangles[2] = new ComparableRectangle("black", false, 7, 3);

        System.out.println("Pre-sorted: ");
        for (ComparableRectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
        Arrays.sort(rectangles);
        System.out.println("After-sorted: ");
        for (ComparableRectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }
}
