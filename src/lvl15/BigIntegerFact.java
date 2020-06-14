package lvl15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BigIntegerFact {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        String s = String.valueOf(n);
        if (n == 0){
            s="1";
        }else if (n<0){
            s="0";
        }else if (n>0){
            BigInteger result=BigInteger.valueOf(1);
            for (Integer i = 1; i <=n  ; i++) {
                result=result.multiply(BigInteger.valueOf(i));
            }
            s=String.valueOf(result);
        }

        return s;
    }
}
