package lvl10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ShellSortAlg
{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[9]);
        System.out.println(array[10]);

    }

    public static void sort(int[] array) {
        int interval=array.length/2;
        while (interval>0){
            for (int i = 0; i < array.length-interval; i++) {
                int x=i;
                while (x>=0 && array [x] > array[x+interval] ){
                    int buffer=array[x];
                    array [x]=array[x+interval];
                    array [x+interval]=buffer;
                    x--;
                }
            }
            interval=interval/2;
        }
    }
}
