package lvl1to4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Week {
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s=reader.readLine();
        int i=Integer.parseInt(s);

        if (i==1)
            System.out.println("понедельник");
        if (i==2)
            System.out.println("вторник");
        if (i==3)
            System.out.println("среда");
        if (i==4)
            System.out.println("четверг");
        if (i==5)
            System.out.println("пятница");
        if (i==6)
            System.out.println("суббота");
        if (i==7)
            System.out.println("воскресенье");

        if (i<1 || i>7)
                System.out.println("такого дня недели не существует");
    }
}
