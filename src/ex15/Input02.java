package ex15;

import java.io.IOException;
import java.io.InputStreamReader;

public class Input02 {
    public static void main(String[] args) {
        // InputStream 추상메서드 << 어떤걸 가져올지 모르기 때문에

        InputStreamReader ir = new InputStreamReader(System.in); // 키보드에 들어온 값을 바로 읽음

        // 읽기
        try {
            char[] ch = new char[5]; // 크기를 정해서 받을수 있다.
            ir.read(ch);

            for (char c : ch) {
                System.out.println(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
