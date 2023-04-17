package ru.urfu;

/**
 * Человек
 */
public interface Person {

    /**
     * Текущее местоположение
     */
    Position getPosition();

    /**
     * Установить текущее местоположение
     */
    void setPosition(Position position);

    /**
     * Пройти до указанного места из текущего местопложения
     *
     * @param destination место назначения
     */
    void walk(Position destination);
}
