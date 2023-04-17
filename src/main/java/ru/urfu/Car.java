package ru.urfu;

/**
 * Автомобиль
 *
 */
public interface Car {
    /**
     * Довозит человека до определённой точки
     * @param person водитель/пассажир
     * @param destination точка назначения
     */
    void drive(Person person, Position destination);
}
