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
        System.out.println("매개변수 생성자");
        number = a;
        multi = b;
    }
}

public class CodeTest {
    public static void main(String[] args) {
        Mathy obj = new Mathy();
        System.out.println(obj.add(30, 6));
        System.out.println(obj.number);
        System.out.println(obj.multi);
        System.out.println(obj.total);
    }

}
