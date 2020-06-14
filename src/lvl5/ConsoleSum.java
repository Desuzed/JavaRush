package lvl5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleSum {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        while (true){
            String s = reader.readLine();
            if (s.equals("сумма")) {
                break;
            }else {
                int i=Integer.parseInt(s);
                sum=sum+i;
            }
        }System.out.println(sum);
    }
}
