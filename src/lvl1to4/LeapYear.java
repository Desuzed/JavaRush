package lvl1to4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LeapYear {
    public static void main(String[] args) throws Exception {
    BufferedReader reader=new BufferedReader (new InputStreamReader(System.in));
    int year=Integer.parseInt(reader.readLine());
    int x=365;
    int y=366;

    if(year%400==0){
        System.out.println("количество дней в году: " + y);
    }else if(year%100==0 && year%400==0) {
        System.out.println("количество дней в году: " + y);
    }else if (year%4==0 && year%100!=0){
        System.out.println("количество дней в году: " + y);
    }else System.out.println("количество дней в году: " + x);
}
}
