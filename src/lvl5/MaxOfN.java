package lvl5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaxOfN {
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n=Integer.parseInt(reader.readLine());
            int maxRead=-2147483648;
            int maximum =0 ;
            if (n>0){
                for (int i = 0; i <n ; i++) {

                    int read=Integer.parseInt(reader.readLine());
                    maximum=read>maxRead ? maxRead=read : maxRead;
                }
                System.out.println(maximum);
            }else { }
        }
}
