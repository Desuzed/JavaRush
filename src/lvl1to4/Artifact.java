package lvl1to4;

public class Artifact {
    String epos;
    int age;
    int number;

    static int count = 0;

public Artifact (int age, String epos, int number){
        this.epos=epos;
        this.age=age;
        this.number=number;
        count++;
}
public Artifact (int number ){
        this.number=number;
        count++;
}

public Artifact (String epos, int number){
    this.number=number;
    this.epos=epos;
    count++;
}

    public static void main(String[] args) {
    Artifact stick=new Artifact(001);
    Artifact ring=new Artifact(5, "Ацтеки", 003);
    Artifact bell=new Artifact("Шумеры",  002);

        System.out.println("Трость : Инвентарный номер - "+ stick.number  );
        System.out.println("Колокол : Инвентарный номер - "+ bell.number + "Век - " +  bell.age );
        System.out.println("Кольцо : Инвентарный номер - "+ ring.number + "Век - " +  ring.age + "Эпоха:" + ring.epos );
    }
}