package ru.geekbrains.lesson04;

public class TriangleArea {

    public static double calculate(int a, int b, int c) {

        double area = 0;
        if (a>=0 & b>=0 & c>=0) {

            double perimeter = (a + b + c);
            perimeter = perimeter / 2;

            area = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));

        } else {
            System.out.println("Одна из сторон меньше нуля");
        }
        return area;
    }
}
