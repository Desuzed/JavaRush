package lvl13;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName);
        int i;
        while((i=fileInputStream.read())!=-1){
            System.out.print((char)i );
        }
        reader.close();
        fileInputStream.close();
    }
}

/*

try (BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)))){
        String str;
        while ((str=reader.readLine())!=null){
        result+=str+" ";
        }
        reader.close();
        } catch (IOException e) {
        System.out.println("ошибка");
        }
*/
