package lvl17.ComandMultiArgs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        String name = "";
        String bd = "";
        String sex = "";
        int id;
        Date date = null;
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 0; i < args.length; i = i + 3) {
                        try {
                            name = args[i + 1];
                            sex = args[i + 2];
                            bd = args[i + 3];
                        } catch (ArrayIndexOutOfBoundsException e) {
                            break;
                        }
                        date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(bd);
                        if (sex.equalsIgnoreCase("м")) {
                            allPeople.add(Person.createMale(name, date));
                        } else if (sex.equalsIgnoreCase("ж")) {
                            allPeople.add(Person.createFemale(name, date));
                        }
                        System.out.println(allPeople.size() - 1);
                       // System.out.println(allPeople.get(allPeople.size()-1).getBirthDate());
                    }
                    break;
                }
            case "-u":
                synchronized (allPeople) {
                    for (int i = 0; i < args.length; i = i + 4) {
                        try {
                            id = Integer.parseInt(args[i + 1]);
                            name = args[i + 2];
                            sex = args[i + 3];
                            bd = args[i + 4];
                        } catch (ArrayIndexOutOfBoundsException e) {
                            break;
                        }
                        date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(bd);
                        if (sex.equalsIgnoreCase("м")) {
                            allPeople.get(id).setName(name);
                            allPeople.get(id).setBirthDate(date);
                            allPeople.get(id).setSex(Sex.MALE);
                        } else if (sex.equalsIgnoreCase("ж")) {
                            allPeople.get(id).setName(name);
                            allPeople.get(id).setBirthDate(date);
                            allPeople.get(id).setSex(Sex.FEMALE);
                        }
                    }
                    break;
                }
            case "-d":
                synchronized (allPeople) {
                    for (int i = 0; i < args.length; i++) {
                        try {
                            id = Integer.parseInt(args[i + 1]);
                        } catch (ArrayIndexOutOfBoundsException e) {
                            break;
                        }
                        allPeople.get(id).setName(null);
                        allPeople.get(id).setBirthDate(null);
                        allPeople.get(id).setSex(null);
                    }
                    break;
                }
            case "-i":
                synchronized (allPeople) {
                    for (int i = 0; i < args.length; i++) {
                        try {
                            id = Integer.parseInt(args[i + 1]);
                        } catch (ArrayIndexOutOfBoundsException e) {
                            break;
                        }
                        name = allPeople.get(id).getName();
                        Sex enumSex = allPeople.get(id).getSex();
                        sex = enumSex == Sex.MALE ? "м" : "ж";
                        String dateStr = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(allPeople.get(id).getBirthDate());
                        System.out.println(name + " " + sex + " " + dateStr);
                    }
                    break;
                }
        }
    }

    public static void create (){

    }
}


//-u 0 Миронов м 15-Apr-1990 1 Кукикамора ж 1-Apr-1985