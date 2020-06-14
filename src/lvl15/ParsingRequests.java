package lvl15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ParsingRequests {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Введите ссылку");
            String s = reader.readLine();
            if (s.equalsIgnoreCase("exit")) {
                break;
            }
            String parameters = s.substring((s.indexOf("?") + 1));
            System.out.println(parameters);
            ArrayList<String> list = new ArrayList<>();
            splitList(list, parameters);                //Разделяем строку по знакам "?"
            substringList(list);                        //Отсекаем всё, что находится после знака "="
            System.out.print("Содержатся параметры: ");
            for (int i = 0; i < list.size(); i++) {     //Вывод параметров
                System.out.print(list.get(i) + " ");
            }

            if (parameters.contains("obj")) {           //Проверяем, есть ли параметр под названием "obj"
                System.out.println();
                String objParam = parameters.substring(parameters.indexOf("obj=") + 4, parameters.indexOf("&"));
                if (isDouble(objParam)) {
                    alert(Double.parseDouble(objParam));
                } else alert(objParam);
            }
            System.out.println("Завершить работу? Введите \"yes\" для подтверждения.");
            String isExit = reader.readLine();
            if (isExit.equalsIgnoreCase("yes")){
                break;
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }

    public static boolean isDouble(String string) {          //Для проверки на дабл можно  юзать, нашел в комментах
        try {
            Double.parseDouble(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static ArrayList<String> splitList(ArrayList<String> list, String parameters) {
        for (String regex : parameters.split("&")) {
            list.add(regex);
        }
        return list;
    }

    public static ArrayList<String> substringList(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("=")) {
                String str = list.get(i).substring(0, list.get(i).indexOf("="));
                list.set(i, str);
            }
        }
        return list;
    }
}

//http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
//http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
