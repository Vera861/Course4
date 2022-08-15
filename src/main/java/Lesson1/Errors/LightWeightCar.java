package Lesson1.Errors;

public class LightWeightCar extends Car implements Moveable, Openable {

    // расширение видимости метода родительского класса - public
    @Override
    public void start() {
        super.start();
    }
    @Override
    public void open() {
        System.out.println("Car is open");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
