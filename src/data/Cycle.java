package data;

import java.util.ArrayList;
import java.util.List;

public class Cycle implements data {
    static List<String> cycleList = new ArrayList<>();

    @Override
    public void add(List entries) {
        entries.stream().forEach(element -> {
            if (element.equals("HERCULES")) cycleList.add(element.toString());
        });
        System.out.println("CYCLELIST:" + cycleList);

    }
}
