package lvl6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayReturnsMax {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] mas=new int[20];
        for (int i = 0; i < mas.length; i++) {
            mas[i]=Integer.parseInt(reader.readLine());
        }
        return mas;
    }

    public static int max(int[] array) {
        int buffer=Integer.MIN_VALUE;
        for (int i = 0; i < array.length-1; i++) {
            if (array [i] > array [i+1] && array[i]>buffer){
                buffer=array[i];
            }
            if (array[i+1]>array[i] && array [i+1]>buffer){
                buffer=array[i+1];
            }
        }
        return buffer;
    }
}
