package lvl9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SortStringsAndNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()|| s==null) {
                break;
            }
            list.add(s);
        }


        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        ArrayList <Integer> numbers = new ArrayList<>(); //Создаем два списка строк и чисел
        ArrayList <String> strings = new ArrayList<>();

        for (String s:array) {                      //Проверяем массив на наличие чисел и строк и заносим их в соответствующие листы
            if (isNumber(s)){
                numbers.add(Integer.parseInt(s));
            }else strings.add(s);
        }
        //  System.out.println(numbers);            //тупо проверка
        // System.out.println(strings);
        boolean isSorted=false;
        int buffer;
        while (!isSorted) {                     //Сортировка чисел пузырьком по убыванию
            isSorted=true;
            for (int i = 0; i < numbers.size()-1; i++) {
                if (numbers.get(i) < numbers.get(i+1)) {
                    isSorted=false;
                    buffer=numbers.get(i);
                    numbers.set(i, numbers.get(i+1));
                    numbers.set(i+1, buffer);
                }
            }
        }
        //   System.out.println("\n" + numbers);
        String buf;
        boolean isSortedString=false;
        while (!isSortedString) {           //сортировка строк по возрастанию
            isSortedString=true;
            for (int i = 0; i < strings.size()-1; i++) {
                if (isGreaterThan(strings.get(i), strings.get(i+1))) {
                    isSortedString=false;
                    buf=strings.get(i);
                    strings.set(i, strings.get(i+1));
                    strings.set(i+1, buf);
                }
            }
        }
        // System.out.println("\n"+strings);
        int numCounter=0;
        int strCounter=0;
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                array[i] = Integer.toString(numbers.get(numCounter));
                numCounter++;
            }else   {
                array[i]=strings.get(strCounter);
                strCounter++;
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
