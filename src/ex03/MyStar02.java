package ex03;

import java.util.Scanner;

public class MyStar02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("층수를 입력하세요");
        int input = (sc.nextInt() + 1) / 2;
        for (int i = 0; i < input; i++) {
            for (int j = input - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 2 * i + 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = input - 1; i > 0; i--) {
            for (int j = input - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 2 * i - 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}
