package ex06;

// 구현체 : Car
interface CarAble {
    void 전진();

    void 후진();

    void 스탑();
}

// 인터페이스 보세요!!
class Car implements CarAble {
    private void a1() {
    }

    private void a3() {
    }

    private void a5() {
    }

    private void a6() {
    }

    private void a7() {
    }

    private void a8() {
    }

    // 앞으로 가게 하려면 a1, a3, a5, a6 를 순서대로 호출해
    // 뒤로 가게 하려면 a8, a7, a6, a5 순서대로 호출해
    // 멈추려면 a3, a7 호출하면 돼

    public void 전진() {
        a1();
        a3();
        a5();
        a6();
        System.out.println("전진함");
    }

    public void 후진() {
        a8();
        a7();
        a6();
        a5();
        System.out.println("후진함");
    }

    public void 스탑() {
        a3();
        a7();
        System.out.println("멈춤");
    }
}

public class Inter03 {

    public static void start(CarAble c) {
        c.전진();
        c.스탑();
        c.후진();
    }

    public static void main(String[] args) {
        start(new Car());
    }
}
