package practice;

public class Lvup001 {
    public static void main(String[] args) {
        String date = "2023-05-26";
        int am[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int yam[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int sum = 0;
        String[] date2 = date.split("-");
        int a = Integer.parseInt(date2[0]);
        System.out.println(a);
        int b = Integer.parseInt(date2[1]);
        System.out.println(b);
        int c = Integer.parseInt(date2[2]);
        System.out.println(c);
        for (int i = 0; i < yam.length; i++) {
            sum = sum + yam[i];
        }
        if (a % 4 == 0) {
            int numd = a * 365 + sum + c;
            System.out.println(am[0]);
            System.out.println(numd);
        }
        System.out.println(sum);
    }
}
