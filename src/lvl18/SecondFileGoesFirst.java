package lvl18;

import java.io.*;

public class SecondFileGoesFirst {
    public static void main(String[] args) throws IOException {
        //Объединяет два файла в первом. Сначала идёт весь второй файл, потом то, что было в первом
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        FileInputStream fileRead1 = new FileInputStream(fileName1);
        byte [] buffer = new byte[fileRead1.available()];
        int count=0;
        while (fileRead1.available()>0){
            count = fileRead1.read(buffer);
        }
        FileOutputStream fileWrite1 = new FileOutputStream(fileName1);
        FileInputStream fileRead2 = new FileInputStream(fileName2) ;
        while(fileRead2.available()>0){
            fileWrite1.write(fileRead2.read());
        }
        fileWrite1.write(buffer, 0, count);
        fileRead1.close();
        fileRead2.close();
        fileWrite1.close();
    }
}
