package lvl13.Repka;

import java.util.ArrayList;

/* 
Репка
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<Person> plot = new ArrayList<Person>();
        plot.add(new Person("Репка", "Репку"));
        plot.add(new Person("Дедка", "Дедку"));
        plot.add(new Person("Бабка", "Бабку"));
        plot.add(new Person("Внучка", "Внучку"));
        RepkaStory.tell(plot);
    }
}
