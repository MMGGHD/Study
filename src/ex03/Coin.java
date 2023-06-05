package ex03;

public class Coin {
    public static void main(String[] args) {
        // 500, 100, 50, 10 (개수를 최소로 해서 주세요.)
        final int money = 10; // 나중에 스캐너로 수정
        int restMoney = money; // 남은 금액 변수 만들기
        int count; // 동전개수를 담을 변수
        // 배열에 동전을 넣는다 >> for문으로 배열의 크기만큼 돌리고 4줄로 끝나게

        int coins[] = { 500, 100, 50, 10 }; // 배열아닌 수식으로 할수 있는 방법?
        // 500 100 50 10을 알고리즘으로 찾는것은 어렵지만, 인덱스값인 0 1 2 3로 알고리즘을 찾는것은 간단하다.
        for (int i = 0; i < coins.length; i = i + 1) {
            count = restMoney / coins[i];
            System.out.println(coins[i] + "원 : " + count);
            restMoney = restMoney - coins[i] * count;

            /*
             * 또는
             * for(int m : coin) {
             * count = restMoney / coins[i];
             * System.out.println(coins[i] + "원 : " + count);
             * restMoney = restMoney - coins[i] * count;
             * }
             */
        }
    }
}
