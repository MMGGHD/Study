package ex05.ch05;

/**
 * 1. 필요한 메서드만 노출시키고 싶을때
 * 2. 프로그램 설계할때 특정 메서드만 사용하도록 강제할때
 */

// CarAble의 구현체는 Car이다. << 자식클래스에서 부모클래스를 찾는것은 쉽지만 반대는 힘들기 때문에 구현체를 기술한다.
interface CarAble {
    public abstract void 엑셀();
}

class Car implements CarAble {

    private void 엔진가열() { // 엔진, 모터, 바퀴의 기능은 사용자가 만질수 없게 Private로 숨겨둔다.
        System.out.println("엔진가열");
    }

    private void 모터작동() {
        System.out.println("모터작동");
    }

    private void 바퀴회전() {
        System.out.println("바퀴회전");
    }

    public void 엑셀() { // 기능의 조합을 엑셀메서드를 통해 노출시킨다.
        엔진가열();
        모터작동();
        바퀴회전();
    }
}

public class InterEx01 {

    public static void main(String[] args) {
        CarAble sonata = new Car();
        sonata.엑셀();
    }
}
