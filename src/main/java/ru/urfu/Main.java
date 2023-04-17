package ru.urfu;

public class Main {
    /**
     * Переехать из текущего места в заданную точку
     */
    public static void moveTo(Person person, Position destination) {
        Subaru subaru = new Subaru();
        subaru.drive(person, destination);
        if (person.getPosition() != destination) { //машина не всегда может довезти человека до нужного места, поэтому сравниваем координаты
            person.walk(destination);
        }
        assert person.getPosition() == destination;
    }
}
