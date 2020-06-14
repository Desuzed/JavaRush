package lvl13.Repka;

import java.util.ArrayList;

public class RepkaStory {
    static void tell(ArrayList<Person> items) {
        Person first;
        Person second;
        for (int i = items.size() - 1; i > 0; i--) {
            first = items.get(i );
            second = items.get(i-1);
            first.pull(second);

        }
    }
}
