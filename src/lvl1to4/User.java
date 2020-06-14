package lvl1to4;

public class User {
    String name;
    int age;
    int height;

    static int count;

    public User (String name, int age, int height) {
    this.name=name;
    this.age=age;
    this.height=height;
    }

    public User (int age, String name, int height) {
        this.name=name;
        this.age=age;
        this.height=height;
    }

    public User ( int age, int height, String name) {
        this.name=name;
        this.age=age;
        this.height=height;
    }



    public static void main(String[] args) {

    }
}