package lvl19;

import java.io.*;
   /*
Пунктуация
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Считать содержимое первого файла, удалить все знаки пунктуации, включая символы новой строки.
*/

//https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
public class Punctuation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2));
        while (fileReader.ready()) {
            String line = fileReader.readLine().replaceAll("\\p{Punct}", "");
            System.out.println(line);
            fileWriter.write(line);
        }
        reader.close();
        fileReader.close();
        fileWriter.close();
    }
}

