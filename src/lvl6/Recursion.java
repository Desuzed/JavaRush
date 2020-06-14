package lvl6;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(Fact(5));
    }
    static int Fact(int n) {
        if (n==1) {
            System.out.println(n);
            return 1; // условие завершения рекурсивного процесса
        }else
            System.out.println(n);
            return n*Fact(n-1);
        // Fact(n-1) - результат следующих вызовов функции
    }
}
