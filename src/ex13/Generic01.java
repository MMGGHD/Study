package ex13;

// 제네릭 >> new할때 타입을 정할수 있다.
class Box<T> {
    T num;
}

public class Generic01 {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>();
        b1.num = 1;

        Box<Double> b2 = new Box<>();
        b2.num = 1.0;

        System.out.println(b1.num);
        System.out.println(b2.num);
    }
}
