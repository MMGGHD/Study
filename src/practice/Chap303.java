package practice;

import java.util.*;

public class Chap303 {
    public static void main(String[] args) {
        System.out.print("가위(1), 바위(2), 보(3) 중에 하나를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("");
        if (a == 1) {
            System.out.println("<가위>를 냈습니다.");
        } else if (a == 2) {
            System.out.println("<바위>를 냈습니다.");
        } else {
            System.out.println("<보>를 냈습니다.");
        }
        int b = (int) (Math.random() * 3);
        if (b == 1) {
            System.out.println("컴퓨터는 <가위>를 냈습니다.");
        } else if (b == 2) {
            System.out.println("컴퓨터는 <바위>를 냈습니다.");
        } else {
            System.out.println("컴퓨터는 <보>를 냈습니다.");
        }
        System.out.println("");
        if (a % 3 == b % 3) {
            System.out.println("-비겼습니다-");
        } else if ((a + 1) % 3 == b % 3) {
            System.out.println("-졌습니다-");
        } else {
            System.out.println("-이겼습니다-");
        }
        System.out.println("");

        sc.close();
    }
}
