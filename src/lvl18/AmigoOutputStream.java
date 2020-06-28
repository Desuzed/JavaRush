package lvl18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class AmigoOutputStream extends FileOutputStream {

    public static String fileName = "fileName1";
    FileOutputStream fileOutputStream;

    public AmigoOutputStream(FileOutputStream fileOutputStream) throws FileNotFoundException {
        super(fileName);
        this.fileOutputStream = fileOutputStream;
    }

    public static void main(String[] args) throws IOException {
        FileOutputStream amigo = new AmigoOutputStream(new FileOutputStream(fileName));
        amigo.write("Hello\n".getBytes());
        amigo.write("Are u ok?\n".getBytes());
        amigo.close();
    }

    @Override
    public void write(int b) throws IOException {
        fileOutputStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        fileOutputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        fileOutputStream.write(b, off, len);
    }

    @Override
    public void flush() throws IOException {
        fileOutputStream.flush();
    }

    @Override
    public void close() throws IOException {
        fileOutputStream.flush();
        fileOutputStream.write("JavaRush © All rights reserved.".getBytes());
        fileOutputStream.close();
    }
}


