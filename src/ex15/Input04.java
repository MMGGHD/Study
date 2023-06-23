package ex15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

// 버퍼
public class Input04 {
    public static void main(String[] args) {
        // InputStream 추상메서드 << 어떤걸 가져올지 모르기 때문에
        try {
            InputStream in = new FileInputStream("input.txt"); // OS에 있는 파일 input.txt와 App을 잇는 ByteStream 생성
            InputStreamReader ir = new InputStreamReader(in); // ByteStream을 통한 데이터를 읽는 객체 InputStreamReader 생성
            BufferedReader br = new BufferedReader(ir); // InputStreamReader에 버퍼를 장착
            String date = br.readLine(); // readLine() << 내 버퍼를 비우는(버퍼에서 ap에 데이터를 전달하는) 메서드
            System.out.println(date);
            br.close();
        } catch (Exception e) {
            System.out.println("예외 발생!");
        }
    }
}
