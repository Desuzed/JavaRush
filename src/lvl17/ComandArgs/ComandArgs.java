package lvl17.ComandArgs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class ComandArgs {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        String name="";
        String bd = "";
        String sex = "";

        int id;
        if (args[0].equalsIgnoreCase("-c")){
            name = args[1];
            sex = args[2];
            bd = args[3];
            Date date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(bd);
            if (sex.equalsIgnoreCase("м")){
                allPeople.add(Person.createMale(name, date));
            }else if (sex.equalsIgnoreCase("ж")){
                allPeople.add(Person.createFemale(name, date));
            }
            System.out.println(allPeople.size()-1);
        }else
        if (args[0].equalsIgnoreCase("-u")){
            id = Integer.parseInt(args[1]);
            name = args[2];
            sex = args[3];
            bd = args[4];
            Date date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(bd);
            if (sex.equalsIgnoreCase("м")){
                allPeople.get(id).setName(name);
                allPeople.get(id).setBirthDate(date);
                allPeople.get(id).setSex(Sex.MALE);
            }else if (sex.equalsIgnoreCase("ж")){
                allPeople.get(id).setName(name);
                allPeople.get(id).setBirthDate(date);
                allPeople.get(id).setSex(Sex.FEMALE);
            }
        }else if (args[0].equalsIgnoreCase("-d")){
            id = Integer.parseInt(args[1]);
            allPeople.get(id).setName(null);
            allPeople.get(id).setBirthDate(null);
            allPeople.get(id).setSex(null);
        }else  if (args[0].equalsIgnoreCase("-i")){


        }


    }
}
