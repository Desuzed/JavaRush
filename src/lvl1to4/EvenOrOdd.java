package lvl1to4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EvenOrOdd {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String I=reader.readLine();
        int i=Integer.parseInt(I);

        if (i>0 && i<10 && (i-i/2-i/2)==0){
            System.out.println("четное однозначное число");
        }else if (i>0 && i<10 && (i-i/2-i/2)!=0) System.out.println("нечетное однозначное число");

        if (i>9 && i<100 && (i-i/2-i/2)==0){
            System.out.println("четное двузначное число");
        }else if (i>9 && i<100 && (i-i/2-i/2)!=0)System.out.println("нечетное двузначное число");

        if (i>99 && i<1000 && (i-i/2-i/2)==0){
            System.out.println("четное трехзначное число");
        }else if (i>99 && i<1000 && (i-i/2-i/2)!=0)System.out.println("нечетное трехзначное число");

    }
}
