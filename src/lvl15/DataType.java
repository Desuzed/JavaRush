package lvl15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataType {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = null;
            str = reader.readLine();
            if (str.equalsIgnoreCase("exit")) {
                break;
            }
            if (str.contains(".")) {
                try {
                    Double d = Double.parseDouble(str);
                    print(d);
                } catch (Exception e) {
                    print(str);
                }
            } else
                try {
                    int i = Integer.parseInt(str);
                    if (i > 0 && i < 128) {
                        short strShort = (short) i;
                        print(strShort);
                    } else if (i <= 0 || i >= 128) {
                        print(i);
                    }
                } catch (Exception e) {
                    print(str);
                }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
