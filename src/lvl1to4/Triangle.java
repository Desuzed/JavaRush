package lvl1to4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Triangle {
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String A=reader.readLine();
        int a=Integer.parseInt(A);

        String B=reader.readLine();
        int b=Integer.parseInt(B);

        String C=reader.readLine();
        int c=Integer.parseInt(C);

        if (a+b>c &&  a+c>b && c+b>a)
            System.out.println("Треугольник существует");
            else System.out.println("Треугольник не существует");


    }
}
