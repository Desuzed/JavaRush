package lvl18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EncryptFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        int d;
        if (args.length != 0 && args[0].equals("-e")){
            fileOutputStream = new FileOutputStream(args[2]);
            fileInputStream = new FileInputStream(args[1]);
            while (fileInputStream.available()>0){
                d = fileInputStream.read()+1;
                fileOutputStream.write(d);
            }
        }else if (args.length != 0 && args[0].equals("-d")){
            fileOutputStream = new FileOutputStream(args[1]);
            fileInputStream = new FileInputStream(args[2]);
            while (fileInputStream.available()>0){
                d = fileInputStream.read()-1;
                fileOutputStream.write(d);
            }
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
