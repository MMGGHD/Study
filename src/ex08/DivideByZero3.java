package ex08;

// 0으로 나누면 분명 오류가 날건데, 그 제어는 사용자에게 맡기고 싶다. (강제성을 부여하고 싶다.)
public class DivideByZero3 {

    static void divide(int n) throws Exception {

        int result = 10 / n;
        System.out.println("나눗셈 결과: " + result);

    }

    public static void main(String[] args) {
        try {
            divide(0);
        } catch (Exception e) {
            System.out.println(e.getMessage() + " : 0으로 나눌수 없습니다.");
        }
    }

}
