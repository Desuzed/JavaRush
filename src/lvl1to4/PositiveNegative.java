package lvl1to4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PositiveNegative {


        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String A = reader.readLine();
            int a= Integer.parseInt(A);
            String B = reader.readLine();
            int b = Integer.parseInt(B);
            String C = reader.readLine();
            int c = Integer.parseInt(C);

            int countPositive=0;
            if (a > 0) {
                countPositive++;
            } else if (a==0) {
                countPositive = countPositive;
            }
            if (b > 0) {
                countPositive++;
            } else if (b==0) {
                countPositive = countPositive;
            }
            if (c > 0) {
                countPositive++;
            } else if (c==0) {
                countPositive = countPositive;
            }
            System.out.println(countPositive);

/*
            int countNegative=0;
            int countPositive=0;
          if (a > 0) {
                countPositive++;
            } else if (a==0) {
                countNegative = countNegative;
                countPositive = countPositive;
            }else countNegative++;

            if (b > 0) {
                countPositive++;
            } else if (b==0) {
                countNegative = countNegative;
                countPositive = countPositive;
            }else countNegative++;

            if (c > 0) {
                countPositive++;
            } else if (c==0) {
                countNegative = countNegative;
                countPositive = countPositive;
            }else countNegative++;
            System.out.println("количество отрицательных чисел: " + countNegative);
            System.out.println("количество положительных чисел: " + countPositive);
*/
/*          if (a==b && c==b && a==c){    //Пара чисел
                System.out.print(a + " " + b + " " + c);
            }else if (a==c){
                System.out.print(a + " " + c + " ");
            } else if (c==b){
                System.out.print(c + " " + b + " ");
            }else if (a==b){
                System.out.print(a + " " + b + " ");
            }
 */
/*          int count=0;            //Отличное от двух равных число
            if ((a==b && a==c && c==b) || (a!=b && a!=c && c!=b)){

            } else if (a==b && a!=c) {
                count = 3;
                System.out.print(count);
            }else if(b==c && b!=a){
                count = 1;
                System.out.print(count);
            }else if (c==a && c!=b){
                count=2;
                System.out.print(count);
            }*/

    }
}
