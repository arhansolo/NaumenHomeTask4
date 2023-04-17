package ru.urfu;
/**
 * Обозначает что объект позиционируемый,
 * т.е. знает своё местоположение и может его изменить
 */
public interface Positioned {

    /**
     * Текущее местоположение
     */
    Position getPosition();

    /**
     * Установить текущее местоположение
     */
    void setPosition(Position position);
}
