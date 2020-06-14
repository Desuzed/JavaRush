package lvl8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int j=Integer.parseInt(reader.readLine());
            list.add(i,j );
        }
        List <Integer> compare = new ArrayList<>();
        int count=1;
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i).equals(list.get(i+1))) {
                count++;
            }
            if (list.get(i)!=list.get(i+1)){
                compare.add(count);
                count=1;
            }
        }
        compare.add(count);
        Collections.sort(compare);
        System.out.println(compare.get(compare.size()-1));
    }
}
