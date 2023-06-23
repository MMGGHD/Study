package ex08;

// 결과값을 try-catch로 감싸는 방법
public class DivideByZero {

    static void divide(int n) {
        int result = 10 / n;
        System.out.println("나눗셈 결과: " + result);

    }

    public static void main(String[] args) {
        divide(2);
        try {
            divide(0); // << 이런 문제들을 잡아놓아야 한다.
        } catch (Exception e) {
            System.out.println("알고있는 예외면 오류의 내용을 입력할 수 있음");
        }
    }

}
