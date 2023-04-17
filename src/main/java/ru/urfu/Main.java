package ru.urfu;

public class Main {
    /**
     * Переехать из текущего места в заданную точку
     * на любом, заранее определённом транспорте
     */
    public static void moveTo(Person person, Position destination) {
        //реализация могла быть проще, если бы в качестве аргументов передавался ещё и определённый транспорт. Можно было бы обойти
        //реализацию методов get/set position у Bike
        Bike bike = new Bike();
        if (bike.getPosition() != person.getPosition()) { //проверяем, находится ли человек в транспорте или нет
            person.walk(bike.getPosition());
        }

        bike.drive(person, destination);
        if (person.getPosition() != destination){
            person.walk(destination);
        }
        assert person.getPosition() == destination;
    }
}
