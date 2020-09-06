package lvl18;

import java.io.*;
import java.util.ArrayList;

public class ParsingFile {
    private static int id;
    private static String productName;
    private static double price;
    private static int quantity;
    public static void main(String[] args) throws IOException {
        BufferedReader sysReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = sysReader.readLine();
        BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));

        String str;
        ArrayList<String> listOfStrings = null;
        while ((str = reader.readLine()) != null) {
            if (str.startsWith(args[0])) {              //i*d, который передан первым параметром
                listOfStrings = splitList(str);
            }
        }
        parsingList(listOfStrings);
        //  System.out.println(listOfStrings);
        System.out.println(id + " " + productName+ " " + price + " " + quantity);
        sysReader.close();
        reader.close();
    }

    public static ArrayList<String> splitList(String str) {         //Сплит строки по пробелам в ArrayList
        ArrayList<String> list = new ArrayList<>();
        for (String element : str.split(" ")) {
            list.add(element);
        }
        return list;
    }
    public static ArrayList<String> parsingList(ArrayList<String> list) {
        String resultName = "";
        double d;
        for (int i = 1; i < list.size(); i++) {
            if (list.size() >= 4) {
                try {                                                   //Пробуем парсить чтобы искать имена, в которых есть пробелы
                    d = Double.parseDouble(list.get(i));
                } catch (NumberFormatException e) {
                    if (resultName.isEmpty()){                          //Блок if для того, чтобы resultName не начинался с пробела
                        resultName = list.get(i);
                    }else {
                        resultName =resultName + " "  + list.get(i);
                    }
                    list.remove(i);
                    i--;
                }
            }
        }
        list.add(1, resultName);
        ParsingFile.id = Integer.parseInt(list.get(0));
        ParsingFile.productName = list.get(1);
        ParsingFile.price = Double.parseDouble(list.get(2));
        ParsingFile.quantity = Integer.parseInt(list.get(3));
        //  System.out.println(resultName);
        return list;
    }
}
