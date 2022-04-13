package com.kenIT;

import java.util.Scanner;

public class TriangleExample {
    Scanner scanner = new Scanner(System.in);

    public void triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 < side3) { //if sum of 2 side is less than third side then throw exception
            throw new IllegalTriangleException("Triangle violet the rule."); // throw is used to create a new exception and throw it.
        }
        else {
            System.out.println("Triangle follows the rule."); //if no exception occur
        }
    }
}

