package ex06;

class 미니언 {
    public 미니언() {
        System.out.println("미니언이 생성되었습니다");
    }
}

class 바론 { // 싱글톤 패턴
    private static 바론 instance = new 바론();

    public static 바론 getInstance() {
        return instance;
    }

    private 바론() {
    }
}

public class Single01 {
    public static void main(String[] args) {

        미니언 m1 = new 미니언();
        미니언 m2 = new 미니언();
        미니언 m3 = new 미니언();

        System.out.println(m1.hashCode()); // 동일 메모리를 참조하는지 알기위해 나타내는 숫자
        System.out.println(m2.hashCode());
        System.out.println(m3.hashCode());

        바론 b1 = 바론.getInstance();
        바론 b2 = 바론.getInstance();

        System.out.println(b1.hashCode()); // 동일 메모리 주소를 알기위해 나타내는 숫자
        System.out.println(b2.hashCode());

        if (b1 instanceof 바론) { // 동일 타입 알아보는 키워드
            System.out.println("같은타입 입니다.");
        }
        if (b1 instanceof Object) { // Object클래스는 모든 클래스의 부모클래스
            System.out.println("바론과 Object는 같은타입 입니다.");
        }
    }
}