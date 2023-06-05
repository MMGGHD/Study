package ex03;

import java.util.Scanner;

public class Gugudan02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dan = sc.nextInt();
        int gop = sc.nextInt();
        for (int i = 2; i <= dan; i++) {
            for (int k = 1; k <= gop; k++) {
                if (k < gop) {
                    System.out.print(i + "*" + k + "=" + i * k + ", ");
                } else {
                    System.out.println(i + "*" + k + "=" + i * k);
                }
            }
        }
        sc.close();
    }
}
