package lvl1to4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class XandY {

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)) ;
        String A=reader.readLine();
        String B=reader.readLine();
        int a=Integer.parseInt(A);
        int b=Integer.parseInt(B);

        if (a>0 && b>0){
            System.out.println("1");
        }else if (a<0 && b>0){
            System.out.println("2");
        }else if (a<0 && b<0){
            System.out.println("3");
        }else if (a>0 && b<0){
            System.out.println("4");
        }
    }
}
