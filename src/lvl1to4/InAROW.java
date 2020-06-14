package lvl1to4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InAROW {
/*
    public static int maxOf2 (int a, int b){
        int m;
        if (a>=b)
            m=a;
        else m=b;
        return m;
    }

    public static int maxOf3 (int a, int b, int c) {
        int m;
        if (a>= b && a>= c) {
            m = a;
        } else if (b >= a && b >= c) {
            m = b;
        } else if (c >= a && c >= b) {
            m = c;
            return m;
        }

    }
*/
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String A=reader.readLine();
        String B=reader.readLine();
        String C=reader.readLine();
        int a=Integer.parseInt(A);
        int b=Integer.parseInt(B);
        int c=Integer.parseInt(C);
/* //Среднее из трёх
        if ((a>=b && a<=c) || (a>=c && a<=b)){
            System.out.printf("%d",a);
        }else if ((b>=a && b<=c) || (b>=c && b<=a)){
            System.out.printf("%d",b);
        }else if ((c>=b && c<=a) || (c>=a && c<=b)){
            System.out.printf("%d",c);
        }
*/
//располоэить три числа по порядку убывания
        if (a>=b && b>=c){
            System.out.printf("%d %d %d",a,b,c);
        }else if (b>=a && a>=c){
            System.out.printf("%d %d %d",b,a,c);
        }else if (c>=a && a>=b){
            System.out.printf("%d %d %d",c,a,b);
        }else if (a>=c && c>=b){
            System.out.printf("%d %d %d",a,c,b);
        }else if (b>=c && c>=a){
            System.out.printf("%d %d %d",b,c,a);
        }else if (c>=b && b>=a){
            System.out.printf("%d %d %d",c,b,a);
        }
    }
}
