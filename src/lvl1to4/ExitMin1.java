package lvl1to4;
import java.io.*;

public class ExitMin1 {


        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int sum=0;
            while (true)
            {
                int i=Integer.parseInt(reader.readLine());
                sum=sum+i;
                if(i==-1)

                    break;
            }
            System.out.print(sum);
        }

}
