package lvl18;

import java.io.*;

public class WriteFrom2Files {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        FileOutputStream file1 = new FileOutputStream(fileName1);
        FileInputStream file2 = new FileInputStream(fileName2);
        FileInputStream file3 = new FileInputStream(fileName3);
        int d;
        while (file2.available()>0) {
            d=file2.read();
            file1.write(d);
             System.out.println((char) d);
        }
        while (file3.available()>0) {
            d=file3.read();
            file1.write(d);
            System.out.println((char) d);
        }

      /*  FileOutputStream fileAppend = new FileOutputStream(fileName1, true);
        while (file3.available()>0){
            d = file3.read();
            fileAppend.write(d);
            //System.out.println((char) d);
        }*/

        reader.close();
        file1.close();
        file2.close();
        file3.close();
        //fileAppend.close();
    }
}
