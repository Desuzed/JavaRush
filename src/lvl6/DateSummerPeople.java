package lvl6;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateSummerPeople {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("0", dateFormat.parse("MAY 1 2012"));
        map.put("1", dateFormat.parse("JUNE 1 2010"));
        map.put("2", dateFormat.parse("SEPTEMBER 1 2010"));
        map.put("3", dateFormat.parse("MAY 1 2010"));
        map.put("4", dateFormat.parse("JUNE 1 2010"));
        map.put("5", dateFormat.parse("JANUARY 1 2010"));
        map.put("6", dateFormat.parse("JUNE 1 2010"));
        map.put("7", dateFormat.parse("DECEMBER 1 2010"));
        map.put("8", dateFormat.parse("JUNE 1 2010"));
        map.put("9", dateFormat.parse("AUGUST 1 2010"));


        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) throws ParseException  {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Date> pair = iterator.next();
            String key = pair.getKey();
            Date value = pair.getValue();
            int month=value.getMonth();
            if (month>4 && month<8){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) throws ParseException {
        Map <String, Date> map = createMap();
        removeAllSummerPeople(map);
        System.out.println(map);
    }
}
