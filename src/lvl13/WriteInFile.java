package lvl13;

import java.io.*;

public class WriteInFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        while (true){
            String s = reader.readLine();
            writer.write(s+"\n");

            if (s.equals("exit")){
                break;
            }
        }
        writer.close();
    }
}
