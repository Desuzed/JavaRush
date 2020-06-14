package lvl13;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class FileReaderAndSort {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        ArrayList<Integer> list = new ArrayList<>();
        int i;
        while (fileReader.ready()){
            i=Integer.parseInt(fileReader.readLine());
            if (i%2==0){
                list.add(i);
            }
        }
        Collections.sort(list);
        fileReader.close();
        reader.close();
        for (int x : list) {
            System.out.println(x);
        }
    }
}
