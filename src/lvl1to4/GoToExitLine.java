package lvl1to4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GoToExitLine {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean isExit = false;
        while (!isExit)
        {
            String s = reader.readLine();
            isExit = s.equals("exit");
        }
    }
}
