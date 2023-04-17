package ru.urfu;

public class Main {
    /**
     * Переехать из текущего места в заданную точку
     */
    public static void moveTo(Person person, Position destination) {
        //закомментировал альтернативный вариант без создания класса определённого авто (т.е. Subaru)
//        Car Subaru = new Car() {
//            @Override
//            public void drive(Person person, Position destination) {
//                person.setPosition(destination);
//            }
//        };
        Subaru subaru = new Subaru();
        subaru.drive(person, destination);
        if (person.getPosition() != destination) { //машина не всегда может довезти человека до нужного места, поэтому сравниваем координаты
            person.walk(destination);
        }
        assert person.getPosition() == destination;
    }
}
