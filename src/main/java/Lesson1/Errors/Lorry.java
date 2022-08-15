package Lesson1.Errors;

class Lorry extends Car implements  Moveable, Stopable, Openable {

    // расширение видимости метода родительского класса
  @Override
    public void move(){
        System.out.println("Car is moving");
    }

    @Override
    public void stop(){
        System.out.println("Car is stop");
    }

    @Override
    public void open() {
        System.out.println("Car is open");
    }
}
