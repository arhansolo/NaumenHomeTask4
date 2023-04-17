package ru.urfu;
/**
 * Пример одного из возможных видов транспорта. Например, велосипед.
 *
 */
public class Bike implements Transport {
    @Override
    public void drive(Person person, Position destination) {
        person.setPosition(destination);
    }

    @Override
    public Position getPosition() {
        //реализация не имеет значения
        return null;
    }

    @Override
    public void setPosition(Position position) {
        //реализация не имеет значения
    }
}
