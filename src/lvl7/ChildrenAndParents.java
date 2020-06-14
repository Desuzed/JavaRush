package lvl7;

public class ChildrenAndParents {
    public static void main(String[] args) {
        Human anya = new Human("Anya", false, 50);
        Human alex = new Human("Alex", true, 45);
        Human masha = new Human("Masha", false, 51);
        Human maxim = new Human("Maxim", true, 59);
        Human lera  = new Human("Lera", false, 13, alex, anya);
        Human margo  = new Human("Margarita", false, 13, alex, anya);
        Human denis  = new Human("Denis", true, 14, maxim, masha);
        Human sasha  = new Human("Sasha", true, 15, maxim, masha);
        Human tanya  = new Human("Tanya", false, 16, maxim, masha);

        System.out.println(anya);
        System.out.println(alex );
        System.out.println(masha);
        System.out.println(maxim);
        System.out.println(lera);
        System.out.println(margo);
        System.out.println(denis);
        System.out.println(sasha);
        System.out.println(tanya);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name=name;
            this.sex=sex;
            this.age=age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.father=father;
            this.mother=mother;
        }
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
