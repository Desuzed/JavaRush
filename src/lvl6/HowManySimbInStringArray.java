package lvl6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HowManySimbInStringArray {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String [] s=new String[10];
        int [] num=new int[10];
        for (int i = 0; i < s.length; i++) {
            s[i]=reader.readLine();
            num[i]=s[i].length();
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
