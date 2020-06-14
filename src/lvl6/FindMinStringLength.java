package lvl6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FindMinStringLength {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        int min=0;
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        min=list.get(0).length(); //Поиск минимальной длины строки
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length()<min){
                min=list.get(i).length();
            }
        }
        for (int i = 0; i < list.size(); i++) { //Сравнение и вывод строк с одинаковым количеством элементов
            if (list.get(i).length()==min){
                System.out.println(list.get(i));
            }
        }
    }
}
