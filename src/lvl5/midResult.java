package lvl5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class midResult {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int count=0;
        float num=0.0f;
        float midResult=0.0f;
        while(true){
            int i=Integer.parseInt(reader.readLine());
            num=num+i;
            count++;
            if (i==-1){
                num=num+1;
                count--;
                midResult=num/count;
                break;
            }

        }
        System.out.println(midResult);
    }
}
