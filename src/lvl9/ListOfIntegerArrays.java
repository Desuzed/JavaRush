package lvl9;

import java.util.ArrayList;

public class ListOfIntegerArrays {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList <int []> list = new ArrayList<>();
        int [] v=new int[5];
        int [] w=new int[2];
        int [] x=new int[4];
        int [] y=new int[7];
        int [] z=new int[0];
        for (int i = 0; i < v.length; i++) {
            v[i]=i;
        }
        for (int i = 0; i < w.length; i++) {
            w[i]=i;
        }
        for (int i = 0; i < x.length; i++) {
            x[i]=i;
        }
        for (int i = 0; i < y.length; i++) {
            y[i]=i;
        }
        for (int i = 0; i < z.length; i++) {
            z[i]=i;
        }
        list.add(v);
        list.add(w);
        list.add(x);
        list.add(y);
        list.add(z);
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
