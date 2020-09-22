package lvl19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TheRichestOne {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        HashMap<String, Double> map = new HashMap<>();
        while (reader.ready()) {
            String[] line = reader.readLine().split(" ");
            String name = line[0];
            Double value = Double.parseDouble(line[1]);
            if (!(map.containsKey(name))) {
                map.put(name, value);
            } else {
                Double result = map.get(name) + value;
                map.put(name, result);
            }
        }
        Double maxValue = Collections.max(map.values());
        for (Map.Entry<String, Double> pair : map.entrySet()) {
            if (pair.getValue().equals(maxValue)) {
                System.out.println(pair.getKey());
            }
        }
        //    System.out.println(map);
        reader.close();
    }
}
