package exam1;

public class Elevator {
    public static void main(String[] args) {
        int a = 13;
        int b = 7;
        int c = 25;

        System.out.printf("%d층 → %s 엘레베이터\n", a, guide(a));
        System.out.printf("%d층 → %s 엘레베이터\n", b, guide(b));
        System.out.printf("%d층 → %s 엘레베이터\n", c, guide(c));
    }

    public static String guide(int floor) {
        // 1. 유효성 검사 (필터링 역할)
        if (floor > 20 || floor < 1)
            return "오류";

        // 2. 리턴값 초기화
        String result = "";

        // 3. 알고리즘
        if (floor <= 10 && floor >= 1) {
            result = "저층";
        } else if (floor >= 11 && floor <= 20) {
            result = "고층";
        }
        return result;
    }
}