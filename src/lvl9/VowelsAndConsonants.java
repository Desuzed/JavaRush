package lvl9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class VowelsAndConsonants {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s=reader.readLine();
        char [] chars = s.toCharArray();
        String textVowels="";
        String textConsonants="";
        for (char i:chars) {
            if (isVowel(i)){
                textVowels=textVowels+i+" ";
            } else if ( i!=' '){
                textConsonants = textConsonants + i + " ";
            }
        }
        System.out.println(textVowels);
        System.out.println(textConsonants);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}
