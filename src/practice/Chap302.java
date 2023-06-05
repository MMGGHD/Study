package practice;

import java.util.Scanner;

public class Chap302 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("성적을 입력하시오 : ");
        int grade = sc.nextInt();
        if (grade >= 90) {
            System.out.println("A학점");
        } else if (grade >= 80) {
            System.out.println("B학점");
        } else if (grade >= 70) {
            System.out.println("C학점");
        } else if (grade >= 60) {
            System.out.println("D학점");
        } else {
            System.out.println("F학점");
        }
        sc.close();
    }
}
