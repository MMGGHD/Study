package practice;

public class CodeTest02 {
    static Integer num1 = 1;
    static int num2 = 1;
    static int num3 = (Integer) num2;
    static Integer num4 = 2;
    static Integer num5 = (int) num4;

    public static void main(String[] args) {
        System.out.println(num1 == num2);
        System.out.println(num1.equals(num2));
        System.out.println(num3 + 1 == num4);
        System.out.println(num3 + 1 == num5);
    }
}