package lvl16;

import java.io.*;

public class ReaderFiles {
    public static String firstFileName;
    public static String secondFileName;
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static {
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface{
        String result="";
        private String fileName;
        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            return result;
        }

        @Override
        public void run() {
            try (BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)))){
                String str;
                while ((str=reader.readLine())!=null){
                    result+=str+" ";
                }
                reader.close();
            } catch (IOException e) {
                System.out.println("ошибка");
            }
        }
    }
}
