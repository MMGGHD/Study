package practice;

class Mathy {
    int number;
    int multi;
    int total;

    public int add(int a, int b) {
        number = a;
        multi = b;
        return a * b;
    }

    public Mathy() {
        System.out.println("기본 생성자");
        number = 10000;
        multi = 3;
        total = number * multi;
    }

    public Mathy(int a, int b) {
    }
}

public class CodeTest {
    public static void main(String[] args) {
        System.out.println(5 / 5);
    }

}
