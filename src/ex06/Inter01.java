package ex06;

/*
 *  1. Interface는 new 할수 없다.
 *  2. Interface는 변수를 만들수 있다.
 *  3. Interface는 오직 추상메서드'만' 가질수있다.
 */
interface Remote {
    int NUM = 10; // 4. 인터페이스 변수는 public static final이 생략되어있다. << final은 변수이름을 대문자로 쓴다.

    void run(); // 5. 인터페이스 메서드는 public abstract가 생략되어있다.
}

public class Inter01 {
    public static void main(String[] args) {

    }
}
