package ex03;

import java.util.Scanner;

public class MyStar01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("층수를 입력하세요");
        int input = sc.nextInt();
        for (int i = 0; i < input; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");

        for (int i = 0; i < input; i++) {
            for (int j = input; j > i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        sc.close();
    }
}
