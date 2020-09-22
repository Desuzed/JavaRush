package lvl19.PeopleWithBD;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String.
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами.
Заполнить список PEOPLE используя данные из файла.
Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        while (fileReader.ready()){
            String [] array = fileReader.readLine().split(" ");
            String name = "";
            String bd = "";
            for (String element:array) {
                try {
                    Integer.parseInt(element);
                    bd = bd +  element + " ";
                }catch (Exception e){
                    name = name + element + " ";
                }
            }
            name = name.trim();
            bd = bd.trim();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d M yyyy");
            Date date = simpleDateFormat.parse(bd);
            PEOPLE.add(new Person(name, date));
        }
        for (Person person:PEOPLE) {
            System.out.println(person.getName() + " " + person.getBirthDate());
        }
        fileReader.close();
    }
}
