package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class testCircle {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle("red",true, 5);

        System.out.println("Pre-sorted: ");
        for (ComparableCircle circle : circles){
            System.out.println(circle);
        }

        Arrays.sort(circles);
        System.out.println("After-sorted:");
        for (ComparableCircle circle: circles){
            System.out.println(circle);
        }
    }
}
