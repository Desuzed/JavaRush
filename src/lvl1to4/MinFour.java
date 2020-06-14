package lvl1to4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MinFour {
 /*   public static void main(String[] args) throws Exception {  //MAX FOUR
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String A = reader.readLine();
        int a= Integer.parseInt(A);
        String B = reader.readLine();
        int b = Integer.parseInt(B);
        String C = reader.readLine();
        int c = Integer.parseInt(C);
        String D = reader.readLine();
        int d = Integer.parseInt(D);

        if (a>=b && a>=c && a>=d){
            System.out.println(a);
        }else if (b>=a && b>=c && b>=d){
            System.out.println(b);
        }else  if (c>=b && c>=a && c>=d){
            System.out.println(c);
        }else if (d>=b && d>=c && d>=a) {
            System.out.println(d);
        }
    }
}

*/



   public static int min (int a, int b, int c, int d){
        int m2 = min(a, b);
        int m3 = min(c, d);

        int m23;
        if (m2<=m3)
            m23=m2;
        else m23=m3;
        return m23;
    }

    public static int min (int a, int b){
       int m;
        if (a<=b)
            m=a;
            else m=b;
            return m;
    }


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String A = reader.readLine();
        int a= Integer.parseInt(A);
        String B = reader.readLine();
        int b = Integer.parseInt(B);
        String C = reader.readLine();
        int c = Integer.parseInt(C);
        String D = reader.readLine();
        int d = Integer.parseInt(D);

     //   System.out.println(min(-20, -10));
        System.out.println(min(a, b, c, d));
      //  System.out.println(min(-20, -40, -30, 40));
     //   System.out.println(min(-20, -40, -10, 40));
      //  System.out.println(min(-20, -10, -30, -40));
    }
}
