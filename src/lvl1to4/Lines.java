package lvl1to4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lines {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(reader.readLine());
        int b=Integer.parseInt(reader.readLine());
        for (int i = 0; i <a ; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(8);
            }
            System.out.println();
            }






    }
}
