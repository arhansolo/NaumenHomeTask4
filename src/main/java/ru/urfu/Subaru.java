package ru.urfu;
/**
 * Класс определённого авто
 */
public class Subaru implements Car{
    /**
     * Довозит человека до определённой точки
     */
    @Override
    public void drive(Person person, Position destination) {
        person.setPosition(destination);
    }
}
