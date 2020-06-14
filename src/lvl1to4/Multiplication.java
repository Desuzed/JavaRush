package lvl1to4;

public class Multiplication {
    public static void main(String[] args) {
        int i=1;
        int j=1;
        int res;
        while (i<10) {
            while (j < 10) {
                res = i * j;
                System.out.print(res + " ");

                j++;
            }
            i++;

            j=1;
            System.out.print("\n");


        }
    }
}

