package data;

import java.util.ArrayList;
import java.util.List;

interface data {
    void add(List l);
}

public class Entries {


    static List<String> entries = List.of("HERCULES", "BMW", "AUDI", "VOLKSWAGEN", "BANANA", "APPLE", "PEN");

    public static void main(String[] args) {
        call(entries);
    }


    static void call(List l) {
        Car car = new Car();
        Cycle cycle = new Cycle();
        Fruit fruit = new Fruit();
        Unknown unknown = new Unknown();
        car.add(entries);
        cycle.add(entries);
        fruit.add(entries);
        unknown.add(entries);
        System.out.println(entries);

    }


}







