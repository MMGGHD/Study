package ex15;

import java.io.IOException;
import java.io.InputStream;

public class Input01 {
    public static void main(String[] args) {
        // InputStream 추상메서드 << 어떤걸 가져올지 모르기 때문에

        // 연결(키보드) Stream이기 때문에 1byte씩 읽을수 있음
        InputStream in = System.in;

        // 읽기
        try {
            int date = in.read(); // read << 값이 들어오기를 대기중인 상태 = 리스너
            System.out.println(date);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
