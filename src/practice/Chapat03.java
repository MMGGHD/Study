package practice;

public class Chapat03 {
    public static void main(String[] args) {
        int[][] s = new int[3][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                s[i][j] = j;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.println(s[i][j]);
            }
        }
    }
}
