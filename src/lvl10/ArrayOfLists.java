package lvl10;

import java.util.ArrayList;

public class ArrayOfLists {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList <String> list1 = new ArrayList<>();
        ArrayList <String> list2 = new ArrayList<>();
        list1.add("Hi");
        list1.add("My dear friend");
        list2.add("How are u?");
        list2.add("Fine, thx");
        ArrayList <String> [] list = new ArrayList[2];
        list[0]=list1;
        list[1]=list2;
        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
