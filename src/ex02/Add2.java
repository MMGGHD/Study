package ex02;
import java.util.Scanner;
public class Add2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in 은 키보드를 의미한다.
        int x, y, sum;

        System.out.println("첫번째 숫자"); 
        x = sc.nextInt(); // nextint << 소켓, 값이 들어올때 까지 반복확인하며 멈추어있는 상태

        System.out.println("두번째 숫자"); 
        y = sc.nextInt(); // 값이 들어올때 까지 멈춤

        sum = x+y;
        System.out.println(sum);

        sc.close();
    }
}
