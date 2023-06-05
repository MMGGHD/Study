package practice;

import java.util.Scanner;

public class Lvup01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("날짜를 입력하세요 : ");
        String date = sc.nextLine();
        System.out.print("타입을 입력하세요 : ");
        String type = sc.nextLine();
        System.out.print("더할숫자를 입력하세요 : ");
        int interval = sc.nextInt();

        String[] date2 = date.split("-");
        int a = Integer.parseInt(date2[0]) - 1;
        int b = Integer.parseInt(date2[1]) - 1;
        int c = Integer.parseInt(date2[2]) - 1;
        boolean ox = true;
        if (type.equals("year")) {
            a = a + interval;
        } else if (type.equals("month")) {
            b = b + interval;
        } else if (type.equals("day")) {
            c = c + interval;
        } else {
            System.out.println("year, month, day 중 하나를 입력하세요");
            ox = false;
        }
        if (ox == true) {
            if (b % 12 == 0 || b % 12 == 2 || b % 12 == 4 || b % 12 == 6 || b % 12 == 7 || b % 12 == 9
                    || b % 12 == 11) {
                int day = c % 31;
                int month = (b % 12 + c / 31);
                int year = a + b / 12;
                System.out.println((year + 1) + "-" + (month % 12 + 1) + "-" + (day + 1));
            } else if (b % 12 == 3 || b % 12 == 5 || b % 12 == 8 || b % 12 == 10) {
                if (Integer.parseInt(date2[2]) < 31) {
                    int day = c % 30;
                    int month = (b % 12 + c / 30);
                    int year = a + b / 12;
                    System.out.println((year + 1) + "-" + (month % 12 + 1) % 12 + "-" + (day + 1));
                } else {
                    System.out.println((b % 12 + c / 30) + "월의 day는 30일까지 입니다.");
                }
            } else if (b % 12 == 1) {
                if (Integer.parseInt(date2[2]) < 30) {
                    int day = c % 29;
                    int month = (b % 12 + c / 29);
                    int year = a + b / 12;
                    System.out.println((year + 1) + "-" + (month % 12 + 1) % 12 + "-" + (day + 1));
                } else {
                    System.out.println(((b % 12 + c / 29)) + "월의 day는 29일까지 입니다.");
                }
            }
            sc.close();
        }
    }
}
