package lvl1to4;

public class Phrase {
    public static void main(String[] args) {
        String [] wordListOne = {
        "космический", "спидозный", "радиоактивный", "демонический", "маниакальный",
        "грустныйй", "пьяный", "убогий", "гиперпространственный", "обдолбанный", "истерический", "токсичный"
        };

        String [] wordListTwo = {
                "баклажан", "ёжик",
                "маньяк", "ведьма", "пельмешек",
                "снегурочка", "таджик-фасовщик", "ниндзя",
                "чебурек", "копатыч", "бомж",
                "вафлян", "скелетон", "шаурмечник",
                "задрот", "огурчик", "пёс", "алёшка"
        };

        String [] wordListThree = {
                "пна воздушном шарике", "в ванной",
                "в огне", "в говне", "в обнимку с кактусом", "с синяком",
                "в тракторе", "в очко пьяный", "на велосипедике",
                "с веслом за ухом", "с бревном в глазу", "в облаках"
        };

        int x = wordListOne.length;
        int y = wordListTwo.length;
        int z = wordListThree.length;

        int rand1 = (int) (Math.random()*x);
        int rand2 = (int) (Math.random()*y);
        int rand3 = (int) (Math.random()*z);

        String s =  wordListOne[rand1] +" " +wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println(s);
    }
}
