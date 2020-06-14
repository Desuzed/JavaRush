package lvl7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Sort3or2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> liststr = new ArrayList<>();
        ArrayList <Integer> del3 = new ArrayList<>();
        ArrayList <Integer> del2 = new ArrayList<>();
        ArrayList <Integer> unsorted = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            liststr.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < liststr.size(); i++) {
            if (liststr.get(i)%3==0 && liststr.get(i)%2==0){
                del3.add(liststr.get(i));
                del2.add(liststr.get(i));
            }
            else if (liststr.get(i)%3==0){
                del3.add(liststr.get(i));
            }else if (liststr.get(i)%2==0){
                del2.add(liststr.get(i));
            }else {
                unsorted.add(liststr.get(i));
            }
        }
        printList(del3);
        printList(del2);
        printList(unsorted);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
