package lvl18;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class CRUDTableUandE {


    /*
    Прайсы 2
    */
/*CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается с одним из следующих наборов параметров:
-u id productName price quantity
-d id
Значения параметров:
где id - 8 символов
productName - название товара, 30 символов
price - цена, 8 символов
quantity - количество, 4 символа
-u - обновляет данные товара с заданным id
-d - производит физическое удаление товара с заданным id (все данные, которые относятся к переданному id)
В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины
!!! имя  продукта должно быть окружено кавычками "" в аргументах
*/
    //TODO Совместить две программы в одну
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            char[] idChars = new char[8];
            char[] productNameChars = new char[30];         //Создаем массивы для заполнения их стройками и пробелами
            char[] priceChars = new char[8];
            char[] quantityChars = new char[4];
            ArrayList<String> linesFromFile = readFromFile(fileName);
            if (args.length != 0 && args[0].equals("-d")) {
                Iterator<String> iter = linesFromFile.iterator();
                while (iter.hasNext()) {
                    String next = iter.next();
                    if (next.startsWith(args[1]) && next.contains(args[1])) {
                        iter.remove();
                    }
                }
                System.out.println(linesFromFile);
                writeLinesInFile(linesFromFile, fileName);
            }else  if (args.length != 0 && args[0].equals("-u")){
                for (int i = 0; i <linesFromFile.size() ; i++) {
                    if (linesFromFile.get(i).startsWith(args[1]) && linesFromFile.get(i).contains(args[1])){
                        initCharArray(productNameChars, args[2]);       //Инициаилизация массивов параметрами
                        initCharArray(priceChars, args[3]);
                        initCharArray(quantityChars, args[4]);
                        initCharArray(idChars, String.valueOf(args[1]));
                        String result = String.valueOf(idChars) + String.valueOf(productNameChars) + String.valueOf(priceChars) + String.valueOf(quantityChars);
                        linesFromFile.set(i, result);
                        System.out.println(linesFromFile);
                        writeLinesInFile(linesFromFile, fileName);
                    }
                }
                //-u 1 "Шорты пляжные синие" 159.00 1234
            }
            reader.close();
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
        } //Создаем массив строк, прочитанных из файла

        public static ArrayList<String> readFromFile(String fileName) throws IOException {
            ArrayList<String> list = new ArrayList<>();
            BufferedReader fileReader = new BufferedReader(new FileReader(new File(fileName)));
            String str;
            while ((str = fileReader.readLine()) != null) {
                list.add(str);
            }
            fileReader.close();
            return list;
        }
        //запись строк из листа в файл
        public static void writeLinesInFile(ArrayList<String> list, String fileName) throws IOException {
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(new File(fileName)));
            for (String element : list) {
                fileWriter.write(element + "\n");
            }
            fileWriter.close();
        }

        public static int findMaxId(String fileName) throws IOException {
            //Ищем максимальный ID в файле
            BufferedReader fileReader = new BufferedReader(new FileReader(new File(fileName)));
            String str;
            int maxId = 0;
            while ((str = fileReader.readLine()) != null) {
                int id = Integer.parseInt(str.substring(0, 8).trim());
                if (id > maxId) {
                    maxId = id;
                }
            }
            fileReader.close();
            return maxId;
        }
}
