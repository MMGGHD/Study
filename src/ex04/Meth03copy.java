package ex04;

class Account2 {
    // 입금(입금할 금액, 계좌 잔액)
    int a;

    void deposit(int amount, int money) { // 메서드 호출시 stack 데이터 생성
        int restMoney = money + amount;
        a = restMoney;
    }

}

public class Meth03copy {
    public static void main(String[] args) {
        Account2 ac = new Account2();
        ac.deposit(123, 456);
        int money = ac.a;
        System.out.println(money);
    }
}
