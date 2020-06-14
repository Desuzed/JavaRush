package lvl9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FormatingDates {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-d", Locale.ENGLISH);
        SimpleDateFormat newDateFormat = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);
        String day = reader.readLine();
        Date date =dateFormat.parse(day);
        System.out.println(newDateFormat.format(date).toUpperCase());
    }
}
