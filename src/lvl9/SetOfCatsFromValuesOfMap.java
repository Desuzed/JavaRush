package lvl9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetOfCatsFromValuesOfMap {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map <String, Cat> map = new HashMap<>();
        Cat barsik = new Cat("Барсик");
        Cat murka = new Cat("Мурка");
        Cat vaska = new Cat("Васька");
        Cat rizhik = new Cat("Рыжик");
        Cat sonya = new Cat("Соня");
        Cat mosya = new Cat("Мося");
        Cat mila = new Cat("Мила");
        Cat kesha = new Cat("Кеша");
        Cat gotya = new Cat("Готя");
        Cat petya = new Cat("Петя");
        map.put("Барсик", barsik);
        map.put("Мурка",murka );
        map.put("Васька", vaska);
        map.put("Рыжик", rizhik);
        map.put("Соня", sonya);
        map.put("Мося",mosya );
        map.put("Мила",mila );
        map.put("Кеша", kesha);
        map.put("Готя", gotya);
        map.put("Петя", petya);

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set <Cat> set = new HashSet<>(map.values());
        /*for (Map.Entry entry:map.entrySet()) {

           Object value = entry.getValue();
            set.addAll(value);

        }*/
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
