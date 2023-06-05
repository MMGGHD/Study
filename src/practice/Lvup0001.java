package practice;

public class Lvup0001 {
    public static void main(String[] args) {
        System.out.print("날짜를 입력하세요 : ");
        String date = "2023-02-14";
        System.out.print("타입을 입력하세요 : ");
        String type = "month";
        System.out.println("더할숫자를 입력하세요 : ");
        int interval = 1;

        System.out.println(type);
        System.out.println(interval);

        String[] date2 = date.split("-");
        int year = Integer.parseInt(date2[0]);
        int month = Integer.parseInt(date2[1]);
        int day = Integer.parseInt(date2[2]);

        System.out.println((year) + "년");
        System.out.println((month) + "월");
        System.out.println((day) + "일");

        if ((year % 4 == 0) && (month == 2)) {
            year = year + month % 12;
            month = month / 12 + day % 29;
            day = day % 29;

        }

        System.out.println((year) + "년");
        System.out.println((month) + "월");
        System.out.println((day) + "일");
    }
}