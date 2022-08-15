package Lesson1.Errors;

public class CodeReview {

    interface Moveable {
        void move(); }

    interface Stopable {
        void stop(); }


    // не реализован класс Engine
    abstract class Car {
        public Engine engine;
        private String color;
        private String name;

        // ограничение области видимости метода (protected) - можно исправить на public
        protected void start() {
            System.out.println("Car starting");
        }

        // вынести в отдельный интерфейс
        abstract void open();

        public Engine getEngine() {
            return engine;
        }

        public void setEngine(Engine engine) {
            this.engine = engine;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;

        }

        class LightWeightCar extends Car implements Moveable {
            @Override
            void open() {
                System.out.println("Car is open");
            }

            @Override
            public void move() {
                System.out.println("Car is moving");
            }
        }

        // наследвоание от абстрактного класса Car и реализация интерфейсов Moveable, Stopable (не указано "implements")
        // не реализован абстрактный метод "open"
        // @Override
        class Lorry extends Car, Moveable, Stopable {

            // расширение видимости метода родительского класса
            public void move() {
                System.out.println("Car is moving");
            }

            public void stop() {
                System.out.println("Car is stop");
            }
        }
    }
}
