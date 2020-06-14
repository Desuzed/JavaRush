package lvl15;

public class StaticInit {

        public static void init() {
            System.out.println("static void init()");
        }
        static {
            System.out.println("Static block");
        }

        {
            System.out.println("Non-static block");
            printAllFields(this);
        }

        public int i = 6;

        public String name = "First name";

        static {
            init();
        }

        public StaticInit() {
            System.out.println("Solution constructor");
            printAllFields(this);
        }



        public static void main(String[] args) {
            System.out.println("public static void main");
            StaticInit s = new StaticInit();
        }

        public static void printAllFields(StaticInit obj) {
            System.out.println("static void printAllFields");
            System.out.println(obj.i);
            System.out.println(obj.name);

        }


}
