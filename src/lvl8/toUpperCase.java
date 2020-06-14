package lvl8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class toUpperCase {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        char[] chars = string.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        for (int i = 0; i < chars.length-1; i++) {
            if (chars[i]==' '){
                chars[i+1]=Character.toUpperCase(chars[i+1]);
            }
        }
        String result = new String(chars);
        System.out.println(result);
    }
}
