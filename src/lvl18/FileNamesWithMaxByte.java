package lvl18;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FileNamesWithMaxByte {
    //Программа возвращает байт, который встречается максимальное число раз в файле и имя самого файла
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>(); //где String-имя файла, Integer-байт
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        while (!(fileName=reader.readLine()).equalsIgnoreCase("exit")){
            ReadThread thread = new ReadThread(fileName);
            thread.start();
        }

    }
    public static class ReadThread extends Thread {
        FileInputStream fileInputStream;
        private String fileName;
        public ReadThread(String fileName) throws FileNotFoundException {
            this.fileName = fileName;
            fileInputStream = new FileInputStream(fileName);
        }
        @Override
        public void run() {
            super.run();
            Map <Integer, Integer> map = new TreeMap<   >();
            ArrayList<Integer> list;
            try {
                map = findMax(map);
                System.out.println(map);
                list = findKeyOfMaxValue(map);
                resultMap.put(fileName, list.get(0));
                //   System.out.println("result map is "  + resultMap);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//Метод создаёт мапу с key=байт ; value = сколько раз он встречается
        public  Map <Integer, Integer> findMax (Map <Integer, Integer> map) throws IOException {
            int i = -1;
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
            return map;
        }
//Метод создаёт лист , в котором вернётся сам байт, который встречается больше всех в мапе
// по сути таких байтов МБ несколько, но в задании нужен был лишь один
        public static ArrayList <Integer> findKeyOfMaxValue(Map<Integer, Integer> map) {
            int valueToCompare = -1;
            int keyToCompare = 0;
            for (Map.Entry<Integer, Integer> pair : map.entrySet()) {       //Нахождение максимального compare
                if (pair.getValue() >= valueToCompare) {
                    valueToCompare = pair.getValue();
                    keyToCompare = pair.getKey();
                }
            }
            ArrayList <Integer> list = new ArrayList<>();
            /*for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
                if (pair.getValue() >= valueToCompare) {
                    list.add(pair.getKey());
                    valueToCompare = pair.getKey();
                }
            }*/
            list.add(keyToCompare);
            return list;
        }
    }
}
