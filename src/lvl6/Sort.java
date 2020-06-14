package lvl6;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Sort {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());

        }

        sorting(numbers);
        printer(numbers);

    }

    public static void sorting(int[] arr) {
        int buffer;
        boolean isSort = false;
        while (isSort != true) {
            isSort = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSort = false;
                    buffer = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buffer;

                }

            }
        }
    }
    public static void printer(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }
    }

}
