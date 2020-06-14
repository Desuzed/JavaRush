package lvl6;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int [] array=new int[100];
        for (int i = 0; i < array.length ; i++) {
            array[i]=i;
        }
        System.out.println(Arrays.toString(array));

        System.out.println(binarySearch(array, 49));
    }

    public static int binarySearch (int [] array, int elementToSearch){
        int firstIndex=0;
        int lastIndex=array.length-1;
        int counter=0;
        while (firstIndex<=lastIndex){
            int middleIndex=(firstIndex+lastIndex)/2;
            if (array[middleIndex]==elementToSearch){
                counter++;
                System.out.println("Количество итераций: " + counter);
                return middleIndex;
            }else if (array[middleIndex]<elementToSearch){
                counter++;
                firstIndex=middleIndex+1;
            } else if (array[middleIndex]>elementToSearch){
                counter++;
                lastIndex=middleIndex-1;
            }

        }
        return -1;
    }
}
