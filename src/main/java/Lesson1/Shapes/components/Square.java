package Lesson1.Shapes.components;

public class Square extends Shape {
    int x, y, side;

    public Square(int x, int y, int side, String title) {
        super.shapeTitle = title;
        this.x = x;
        this.y = y;
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + shapeTitle + " with center point at [" + x + ", " + y + "] and side of " + side);
    }
}
