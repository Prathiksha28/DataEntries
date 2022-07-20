package data;

import java.util.ArrayList;
import java.util.List;

public class Unknown implements data {
    List<String> unknownList = new ArrayList<>();

    @Override
    public void add(List entries) {
        entries.stream().filter(element -> !((Car.carList.contains(element)) || (Cycle.cycleList.contains(element)) || (Fruit.fruitList.contains(element)))).forEach(element -> unknownList.add(element.toString()));
        System.out.println("UNKNOWNLIST:" + unknownList);

    }
}
