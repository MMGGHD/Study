package ex06;

/**
 * 1. 추상클래스는 절대로 new 할수 없다.
 * 2. 추상클래스는 일반메서드와 추상메서드를 가질수 있다.
 * 3. 추상메서드는 강제성을 가진다. (오버라이딩을 하지 않으면 오류가 발생한다.)
 * 4. 추상메서드는 상태변수를 가질수 있다.
 */
abstract class 동물 {

    String name;

    public void run() {
        System.out.println("달린다");
    }

    public abstract void speak();
}

class 사자 extends 동물 {

    @Override
    public void speak() {
        System.out.println("어흥");
    }

}

public class Abstract01 {
    public static void main(String[] args) {

    }
}
