package lvl19;

import java.io.*;

public class StringWithNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        while (reader.ready()){
            String [] arrayStr = reader.readLine().split(" ");
            for (int i= 0; i < arrayStr.length ; i++) {
                if (arrayStr[i].matches(".*[0-9]+.*")){
                    writer.write(arrayStr[i]+" ");
                }
            }
        }
        reader.close();
        writer.close();

    }
}
