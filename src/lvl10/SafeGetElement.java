package lvl10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SafeGetElement {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            int x = Integer.parseInt(reader.readLine());
            list.add(x);
        }

        System.out.println(safeGetElement(list, 5, 1));
        System.out.println(safeGetElement(list, 200000, 7));
        System.out.println(safeGetElement(list, -500000, 9));
    }

    public static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue) {
        try {
            return list.get(index);
        }catch (Exception e){
            return defaultValue;
        }
    }
}
