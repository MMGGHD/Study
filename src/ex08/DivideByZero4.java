package ex08;

class Divide {

    static void a() throws Exception {
        b();
        System.out.println("a실행");
    }

    static void b() throws Exception {
        c();
        System.out.println("b실행");
    }

    static void c() throws Exception {
        int result = 10 / 0;
        System.out.println("나눗셈 결과: " + result);
        System.out.println("c실행");
    }

    static void d() {
        System.out.println("d실행");
    }
}

public class DivideByZero4 {
    public static void main(String[] args) {
        try {
            Divide.a();
        } catch (Exception e) {
            System.out.println("오류 발생");
        }
    }
}
