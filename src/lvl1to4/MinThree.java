package lvl1to4;

public class MinThree {
    public static int min (int a, int b, int c) {
        int abc;
        if (a<=b && a<=c)
            abc=a;
        else if (b <= c && b<=a)
            abc=b;
        else if (c<=a && c<=b)
            abc=c;
        else abc=a;

        return abc;
    }



    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 3, 5));
        System.out.println(min(5, 10, 5));
    }
}
