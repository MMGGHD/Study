package ex04;

class Cal01 { // 계산기 클래스
    void add() { // void << return타입(자료형)
        System.out.println("add 호출됨");
    }

    void minus() { // minus
        System.out.println("minus 호출됨");
    }

    void multi(int n1, int n2, int n3) { // multi
        System.out.println("multi : " + (n1 * n2 * n3));
    }

    void divide() { // divide
        System.out.println("divide 호출됨");
    }
}

public class Meth01 {
    public static void main(String[] args) {
    }
}
