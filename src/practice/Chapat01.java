package practice;

public class Chapat01 {
    public static void main(String[] args) {
        int[] s = new int[10];
        for (int i = 0; i < s.length; i++) {
            s[i] = i;
        }
        for (int i : s) {
            System.out.print(i + " ");
        }
    }
}
