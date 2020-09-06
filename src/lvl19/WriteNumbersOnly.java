package lvl19;

import java.io.*;

public class WriteNumbersOnly {
    public static void main(String[] args) throws IOException {
        BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = fileNameReader.readLine();
        String fileName2 = fileNameReader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2));
        while (fileReader.ready()){
            String [] arr = fileReader.readLine().split(" ");
            for (int i = 0; i < arr.length; i++) {
                try {
                    fileWriter.write(Integer.parseInt(arr[i]) + " ");
                }catch (Exception e){

                }
            }
        }

        fileNameReader.close();
        fileReader.close();
        fileWriter.close();
    }
}
