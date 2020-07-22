package lvl18;

import java.io.*;
import java.util.ArrayList;
/*Считать с консоли 2 имени файла.
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415.
Округлить числа до целых и записать через пробел во второй файл.
Закрыть потоки.

Принцип округления:
3.49 => 3
3.50 => 4
3.51 => 4
-3.49 => -3
-3.50 => -3
-3.51 => -4

*/
public class MathRoundAndWriteInFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        BufferedReader lineReader = new BufferedReader(new FileReader(new File(name1)));
        String line = lineReader.readLine();
        ArrayList<String> listOfStrings = new ArrayList<>();
        splitSpaces(listOfStrings, line);                           //Сплит строки по пробелам
        ArrayList<Double> listOfDoubles = new ArrayList<>();
        for (String value : listOfStrings) {                        //Парсинг строк из листа в дабл и добавление в лист даблов
            try {
                listOfDoubles.add(Double.parseDouble(value));
            } catch (Exception e) {
            }
        }
        System.out.println(listOfDoubles);
        int[] buffer = createBuffer(listOfDoubles);                        //Создание буффера для записи его во второй файл
        FileOutputStream fos2 = new FileOutputStream(name2);
        String result = "";
        for (int i = 0; i < buffer.length; i++) {
            result = result + buffer[i] + " ";
        }
        System.out.println(result);
        fos2.write(result.getBytes());
        reader.close();
        lineReader.close();
        fos2.close();
    }
    public static ArrayList<String> splitSpaces(ArrayList<String> list, String line) {
        for (String regex : line.split(" ")) {
            list.add(regex);
        }
        return list;
    }
    public static int[] createBuffer(ArrayList<Double> listOfDoubles) {
        int[] arr = new int[listOfDoubles.size()];
        for (int i = 0; i < arr.length; i++) {
            int j = (int) Math.round(listOfDoubles.get(i));         //Округление и добавление числа в массив
            arr[i] = j;
        }
        return arr;
    }
}
