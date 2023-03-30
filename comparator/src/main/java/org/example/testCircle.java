package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class testCircle {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[1] = new Circle();
        circles[0] = new Circle(3.7);
        circles[2] = new Circle("red", false, 3.5);

        System.out.println("Pre-sorted");
        for (Circle circle : circles){
            System.out.println(circle);
        }
        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles , circleComparator);
        System.out.println("After-sorted: ");
        for (Circle circle: circles){
            System.out.println(circle);
        }
    }
}
