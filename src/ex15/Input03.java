package ex15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 버퍼
public class Input03 {
    public static void main(String[] args) {
        // InputStream 추상메서드 << 어떤걸 가져올지 모르기 때문에

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 가변적인 길이도 사용가능

        // 읽기
        try {
            String date = br.readLine();
            System.out.println(date);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
