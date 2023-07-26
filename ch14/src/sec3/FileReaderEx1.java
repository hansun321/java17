package sec3;

import java.io.FileReader;
import java.io.IOException;

//FileReader : 바이트 단위로
//파일을 읽어오는 방법 : FileReader, BufferedReader, Scanner, Files
public class FileReaderEx1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("out3.txt");
        int rd;
        while ((rd = fr.read()) != -1) {
            System.out.print((char) rd);
        }
    }
}
