package ex15;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Output02 {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("output.txt", false); // OS의 파일 Output.txt와 App을 연결하는 Stream을 생성
            // BufferedOutputStream << 바이트스트림에 버퍼를 달아주는 클래스
            OutputStreamWriter ow = new OutputStreamWriter(os); // ByteStream을 통한 데이터를 쓰는 객체 OutputStreamWriter 생성
            BufferedWriter bw = new BufferedWriter(ow); // OutputStreamWriter에 버퍼를 달아주는 메서드
            try {
                bw.write("hello ");
                bw.write("world");
                bw.flush();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
