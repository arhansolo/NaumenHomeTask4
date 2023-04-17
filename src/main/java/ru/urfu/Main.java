package ru.urfu;

import java.util.Arrays;
import java.util.List;

public class Main {
    /**
     * Переехать из текущего места в заданную точку
     * на любом транспорте с пересадками.
     */
    public static void moveTo(Person person, Position destination) {
        List<Transport> transportList = Arrays.asList(new Car(), new Bike(), new Metro());
        for (Transport transport : transportList){
            if (transport.getPosition() != person.getPosition()) { //проверяем, находится ли человек в транспорте или нет
                person.walk(transport.getPosition());
            }
            transport.drive(person, destination);
        }
        if (person.getPosition() != destination){
            person.walk(destination);
        }

        assert person.getPosition() == destination;
    }
}
