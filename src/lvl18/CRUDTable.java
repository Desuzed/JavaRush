package lvl18;

import java.io.*;
import java.util.ArrayList;

public class CRUDTable {
    //Программа вставляет в файл строку вида, указанного в примерах.

    /*19846   Шорты пляжные синие           159.00  12
      198478  Шорты пляжные черные с рисунко173.00  17
      19847983Куртка для сноубордистов, разм10173.991234*/

    //TODO Совместить две программы в одну
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileOutputStream fos = new FileOutputStream(fileName, true);
        char[] idChars = new char[8];
        char[] productNameChars = new char[30];         //Создаем массивы для заполнения их стройками и пробелами
        char[] priceChars = new char[8];
        char[] quantityChars = new char[4];
        String productName = "";
        String price = "";
        if (args.length!=0 && args[0].equals("-c")) {
            /*for (int i = 1; i < args.length; i++) {
            try {                               //пытаемся парсить параметры, начиная со второго, т.к имя может содержать пробелы
                Double.parseDouble(args[i]);
                price = args[i];
                break;
            } catch (Exception e) {         //Когда парсим строку, то ловим исключение и складываем строки, получая имя продукта
                if (!productName.isEmpty()) {      //просто проверка, чтобы не начиналось с пробела
                    productName = productName + " " + args[i];
                } else {
                    productName = args[i];
                }
            }
        }*/
        int id = findMaxId(fileName) + 1;       //Увеличиваем максимально найденный ID на 1
        initCharArray(productNameChars, args[1]);       //Инициаилизация массивов параметрами
        initCharArray(priceChars, args[2]);
        initCharArray(quantityChars, args[3]);
        initCharArray(idChars, String.valueOf(id));
        //преобразуем полученные массивы чаров в строки и складываем строки в одну, чтобы записать в файл
        String result = String.valueOf(idChars) + String.valueOf(productNameChars) + String.valueOf(priceChars) + String.valueOf(quantityChars) ; //"\n" +
        fos.write(13);
        fos.write(result.getBytes());
    }
        reader.close();
        fos.close();
}
    public static char[] initCharArray(char[] arr, String str) {
        //Функция для посимвольной инициализации массива чаров строкой str и, если нужно, пробелами
        char[] c = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            try {
                arr[i] = c[i];
            } catch (IndexOutOfBoundsException e) {     //если ловим исключение, то добавляем пробел в массив
                arr[i] = ' ';
            }
        }
        return arr;
    }
    public static String splitList(String str) {
        //сплит строки из файла по пробелам для получения первого элемента (ID)
        ArrayList<String> list = new ArrayList<>();
        for (String element : str.split(" ")) {
            list.add(element);
        }
        return list.get(0);
    }
    public static int findMaxId(String fileName) throws IOException {
        //Ищем максимальный ID в файле
        BufferedReader fileReader = new BufferedReader(new FileReader(new File(fileName)));
        String str;
        int maxId = 0;
        while ((str = fileReader.readLine()) != null) {
            int id = Integer.parseInt(str.substring(0,8).trim());
            if (id > maxId) {
                maxId = id;
            }
        }
        fileReader.close();
        return maxId;
    }
}
