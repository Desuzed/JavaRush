package lvl1to4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tricolor {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String A = reader.readLine();
        double t = Double.parseDouble(A);
      //  for (double d = 0; d < 60; d = d + 5) {
        System.out.println(t%5);
            if (t%5 >= 0 && t%5 < 3)
                System.out.println("зелёный");
            if (t%5 >= 3 && t%5 < 4)
                System.out.println("жёлтый");
            if (t%5 >= 4 && t%5 < 5)
                System.out.println("красный");
      //  }
    }
}
