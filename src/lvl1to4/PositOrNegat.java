package lvl1to4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PositOrNegat {
    public static void main(String[] args) throws  Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int i=Integer.parseInt(reader.readLine());

        if (i>0 && (i-i/2-i/2)==0){
            System.out.println("положительное четное число");
        }else   if (i>0 && (i-i/2-i/2)!=0){
            System.out.println("положительное нечетное число");
        }else   if (i<0 && (i-i/2-i/2)==0){
            System.out.println("отрицательное четное число");
        }else   if (i<0 && (i-i/2-i/2)!=0){
            System.out.println("отрицательное нечетное число");
        }else if (i==0){
            System.out.println("ноль");
        }
    }
}
