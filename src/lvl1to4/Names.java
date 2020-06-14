package lvl1to4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Names {
    public static void main(String[] args)throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a=reader.readLine();
        String b=reader.readLine();

        if (a.equals(b) && a.length()==b.length()){
            System.out.println("Имена идентичны");
        }else if (!a.equals(b) && a.length()==b.length()){
            System.out.println("Длины имен равны");
        }


    }
}
