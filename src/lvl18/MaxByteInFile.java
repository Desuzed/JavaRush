package lvl18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//Выводит байты с максимальным количеством повторов, прочитанных из файла
public class MaxByteInFile {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int i;
        Map<Integer, Integer> map = new HashMap<>();
        int count;
        while (fileInputStream.available() > 0) {
            i = fileInputStream.read();
            if (map.containsKey(i)) {
                count = (map.get(i)) + 1;
                map.put(i, count);
            } else {
                map.put(i, 1);
            }
        }
        fileInputStream.close();
        Map<Integer, Integer> mapOfMax = findMax(map);       //Создание второй мапы с максимальными значениями повторений
        for (Map.Entry<Integer, Integer> pair : mapOfMax.entrySet()) {
            System.out.print( "Результат: " + pair.getKey() + " ");
        }

    }

    public static Map<Integer, Integer> findMax(Map<Integer, Integer> map) {
        Map<Integer, Integer> mapOfMax = new HashMap<>();
        int compare = -1;
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (pair.getValue() >= compare) {
                mapOfMax.put(pair.getKey(), pair.getValue());
                compare = pair.getValue();
            }
        }
        Iterator<Map.Entry<Integer, Integer>> iterator = mapOfMax.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            if (entry.getValue() < compare) {
                iterator.remove();
            }
        }
        return mapOfMax;
    }
}
