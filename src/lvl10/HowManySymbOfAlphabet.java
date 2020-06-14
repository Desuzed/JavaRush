package lvl10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HowManySymbOfAlphabet {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а','б','в','г','д','е','ё','ж',
                'з','и','й','к','л','м','н','о',
                'п','р','с','т','у','ф','х','ц',
                'ч','ш','щ','ъ','ы','ь','э','ю','я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        int symbCounter=0;
        ArrayList <Integer> counter = new ArrayList<>();
        for (int i = 0; i < alphabet.size(); i++) {   //Проходим в этом массиве п каждой букве алфавита
            symbCounter=0;                            //Обнуление счётчика
            for (int j = 0; j < list.size(); j++) {   //Проход в массиве слов, которые ввели
                char [] array = list.get(j).toCharArray();  //преобразование j-го слова в набор массив символов
                for (int k = 0; k < array.length; k++) {    //Проход по каждому символу слова
                    if (array[k]==alphabet.get(i)){         //Сравниваем i-ю букву с символом
                        symbCounter++;                      //Увеличиваем счетчик, если буква встретилась
                    }
                }
            }
            counter.add(symbCounter);           //Сохраняем значение счётчика в counter массив , получится 33 значения
        }

        for (int i = 0; i < alphabet.size(); i++) {
            System.out.println(alphabet.get(i)+ " "+ counter.get(i));
        }

    }
}
