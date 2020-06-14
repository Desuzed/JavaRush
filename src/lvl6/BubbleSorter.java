package lvl6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BubbleSorter {
/*
        public void int readerBubble() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размер массива");
        int n=Integer.parseInt(reader.readLine());
        int [] mas=new int[n];
        for (int i = 0; i < n; i++) {
            mas[i]=Integer.parseInt(reader.readLine());
        }
        System.out.println(Arrays.toString(mas));
    }*/

    public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите размер массива");
            int n=Integer.parseInt(reader.readLine());
            int [] mas=new int[n];
            System.out.println("Проинициализируйте массив");
            for (int i = 0; i < n; i++) {
                mas[i]=Integer.parseInt(reader.readLine());
            }
            System.out.println(Arrays.toString(mas));
            int buffer;
            boolean isSorted=false;
            while (!isSorted){
                isSorted=true;
                for (int i = 0; i < n - 1; i++) {
                    if (mas[i]> mas[i+1]){
                        isSorted=false;
                        buffer=mas[i];
                        mas[i]=mas[i+1];
                        mas[i+1]=buffer;
                    }
                }
            }
        System.out.println("Полученный отсортированный массив:\n" + Arrays.toString(mas));
    }
}
