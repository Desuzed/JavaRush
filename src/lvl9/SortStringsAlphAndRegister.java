package lvl9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortStringsAlphAndRegister {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }
        sort(array);
        for (String word : array) {
            System.out.println(word);
        }
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            isGreaterThan(array[i], array[i+1]);
        }
    }

    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}


