package lvl13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NOD {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        System.out.println(NOD(a,b));
    }

    public static int NOD(int a, int b){
        if (a<=0 || b<=0){
            throw new ArithmeticException();
        }
        int nod=0;
        int c = min(a, b);
        while (true){
            if (a%c==0 && b%c==0){
                nod=c;
                break;
            }c--;
        }
        return nod;
    }

    public static int min (int a, int b){
        return a<b?a:b;
    }
}
