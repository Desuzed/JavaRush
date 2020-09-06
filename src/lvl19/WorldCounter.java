package lvl19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class WorldCounter {
    public static int worldCounter=0;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileReader fr = new FileReader(fileName);
        BufferedReader fileReader = new BufferedReader(fr);
        ArrayList <String> list = new ArrayList<>();
        while (fileReader.ready()){
            String str = fileReader.readLine();
            splitStr(str, list);
            System.out.println("Result str is:\n"+str);
        }
        System.out.println("Result list:\n"+list);
        System.out.println("worldCounter: " + worldCounter);
        fileReader.close();
        fr.close();
        reader.close();
    }
    public  static void splitStr (String str , ArrayList<String> list){
        for (String value:str.split("\\p{Punct}")) {  //Сплит по всем знакам пунктуации
            if (value.equalsIgnoreCase("world")){
                worldCounter++;
            }
            list.add(value);
        }
    }
}
