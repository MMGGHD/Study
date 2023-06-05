package practice;
import java.util.Scanner;
public class Chap301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        int a = sc.nextInt();
        if(a%2==0) {
            System.out.println(a+"는 짝수 입니다.");
        }
        else {
            System.out.println(a+"(은)는 홀수 입니다.");}
        sc.close();

    }
}
