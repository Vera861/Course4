package Lesson1.Shapes;

import Lesson1.Shapes.components.Circle;
import Lesson1.Shapes.components.Square;
import Lesson1.Shapes.components.Triangle;

public class AppShapes {

            public static void main(String[] args) {

            System.out.println("Circle");
            new Circle(10,10,5, "Circle").draw();

            System.out.println("Triangle");
            new Triangle(10,10,5, 5, 7, "Triangle").draw();

            System.out.println("Square");
            new Square(10,10,5, "Square").draw();

        }
    }

