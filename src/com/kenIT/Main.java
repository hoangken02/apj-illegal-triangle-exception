package com.kenIT;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TriangleExample triangleExample = new TriangleExample();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input side1: ");
        double side1 = scanner.nextDouble();
        System.out.println("Input side2: ");
        double side2 = scanner.nextDouble();
        System.out.println("Input side3: ");
        double side3 = scanner.nextDouble();
        try {
            triangleExample.triangle(side1,side2,side3);
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
    }
}
