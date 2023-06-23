package ex15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

// 버퍼
public class Input05 {
    public static void main(String[] args) {
        // InputStream 추상메서드 << 어떤걸 가져올지 모르기 때문에
        try {
            InputStream in = new FileInputStream("input.txt");
            InputStreamReader ir = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(ir);

            // while문으로 긴 데이터를 받는 코드
            String allData = "";
            while (true) {
                String date = br.readLine(); // readLine() << 내 버퍼를 비우는(버퍼에서 ap에 데이터를 전달하는) 메서드
                System.out.println(date);
                br.close();
                if (date == null) {
                    break;
                }
                System.out.println(allData);
            }
        } catch (Exception e) {
            System.out.println("예외 발생!");
        }
    }
}
