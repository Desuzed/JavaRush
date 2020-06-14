package lvl5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MinOf5 {
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            int c = Integer.parseInt(reader.readLine());
            int d = Integer.parseInt(reader.readLine());
            int e = Integer.parseInt(reader.readLine());
            int minimum = min(a, b, c, d, e);
            System.out.println("Minimum = " + minimum);
        }

        public static int min(int a, int b, int c, int d, int e) {
            int result=0;
            if (a<=b && a<=c && a<=d && a<=e){
                result=a;
            }else if (b<=a && b<=c && b<=d && b<=e){
                result=b;
            }else if (c<=a && c<=b && c<=d && c<=e){
                result=c;
            }else if (d<=b && d<=c && d<=a && d<=e){
                result=d;
            } else if (e<=b && e<=c && e<=d && e<=a){
                result=e;
            }
            return result;
        }
}


