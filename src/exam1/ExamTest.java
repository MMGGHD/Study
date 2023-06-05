package exam1;

public class ExamTest {
    public static void main(String[] args) {
        int[] a = { 3, 5, 6, 7 };
        int n = 2;
        int[] b = new int[a.length - n + 1];
        for (int i = 0; i < b.length; i++) {
            b[i] = a[n + i - 1];
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

}
