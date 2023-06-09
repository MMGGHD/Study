package ex05.ch03;

abstract class Animal { // 추상클래스는 new 할수없다.
    abstract void speak(); // 추상메서드 클래스의 행동을 정의할수 없을때 사용(body가)
}

class Dog extends Animal {
    void speak() {
        System.out.println("멍멍");
    }
}

public class Exten03 {

    static void start(Animal u) {
        u.speak();
    }

    public static void main(String[] args) {
        Animal d = new Dog();
        start(d);
    }
}
