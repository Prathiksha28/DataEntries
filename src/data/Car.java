package data;

import java.util.ArrayList;
import java.util.List;

public class Car implements data {
    static List<String> carList = new ArrayList<>();

    @Override
    public void add(List entries) {
        entries.stream().forEach(element -> {

            if (element.equals("BMW")) carList.add(element.toString());
            if (element.equals("AUDI")) carList.add(element.toString());
            if (element.equals("VOLKSWAGEN")) carList.add(element.toString());
        });
        System.out.println("CARLIST:" + carList);

    }
}
