package practice;

public class Chapat02 {
    public static void main(String[] args) {
        int s[][] = new int[3][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                s[i][j] = j;
            }
        }
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                System.out.print(s[i][j]);
            }
            System.out.println("");
        }
        System.out.println(s[2].length);
        System.out.println(s.length);
    }

}
