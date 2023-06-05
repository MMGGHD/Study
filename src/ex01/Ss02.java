package ex01;

public class Ss02 {
    public static void main(String[] args) {
        HelloWorld(5);
    }

    public static void HelloWorld(int n) {
        if (n == 0)
            return;
        HelloWorld(n - 1);
        System.out.println("HelloWorld");

    }
}
