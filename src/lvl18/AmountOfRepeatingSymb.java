package lvl18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class AmountOfRepeatingSymb {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fis = new FileInputStream(fileName);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int i;
        int counter = 0;
        while (fis.available() > 0) {
            i = fis.read();
            if (map.containsKey(i)) {
                counter = map.get(i) + 1;
                map.put(i, counter);
            } else map.put(i, 1);
        }
        for (Map.Entry e : map.entrySet()) {
            char c = (char)((int) e.getKey());
            System.out.println(c + " " + e.getValue());
        }
        fis.close();
    }
}
