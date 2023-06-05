package ex01;

public class Var04 {
    public static void main(String[] args) {
        // 문자열
        String s1 = "가나다"; // String은 첫 문자가 대문자 = 클래스 개념
        System.out.println(s1);

        // 연결 연산자 (다른타입을 연결할때)
        String name = "홍길동";
        int age = 25;
        System.out.println(name + "의 나이는" + age); // " "도 String - 바로 집어넣기도 가능
    }
}
