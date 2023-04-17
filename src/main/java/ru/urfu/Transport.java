package ru.urfu;
/**
 * Транспорт
 *
 */
public interface Transport extends Positioned{
    /**
     * Довозит человека до определённой точки
     * @param person водитель/пассажир
     * @param destination точка назначения
     */
    void drive(Person person, Position destination);
}
