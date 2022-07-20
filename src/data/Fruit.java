package data;

import java.util.ArrayList;
import java.util.List;

public class Fruit implements data {
    static List<String> fruitList = new ArrayList<>();

    @Override
    public void add(List entries) {
        entries.stream().forEach(element -> {
            if (element.equals("BANANA")) fruitList.add(element.toString());
            if (element.equals("APPLE")) fruitList.add(element.toString());
        });
        System.out.println("FRUITLIST:" + fruitList);
    }
}
