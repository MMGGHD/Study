package ex04;

class Account {
    // 입금(입금할 금액, 계좌 잔액)
    int deposit(int amount, int money) { // 메서드 호출시 stack 데이터 생성
        int restMoney = money + amount;
        return restMoney; // return << 값을 가진채로 메서드를 호출한 라인의 끝으로 복귀
    }

    // 출금(출금할 금액, 계좌 잔액)
    int withdraw(int amount, int money) { // 두 값을 받아서 빼서 리턴하는 로직
        var restMoney = money - amount;
        return restMoney;
    }

    // 이체(보낼 금액(amount), 받는사람 잔액(receiverMoney), 보낸사람 잔액(senderMoney)), 리턴없이 출력만
    void transfer(int amount, int receiverMoney, int senderMoney) {
        senderMoney = senderMoney - amount;
        System.out.println("보낸사람 잔액 : " + senderMoney);
        receiverMoney = receiverMoney + amount;
        System.out.println("받는사람 잔액 : " + receiverMoney);
    }
}

public class Meth03 {
    public static void main(String[] args) {
        // 홍길동의 잔액
        int hMoney = 1000;

        // 임꺽정의 잔액
        int iMoney = 1000;

        // 홍길동이 입금을 2번하고, 출금 1번하기
        Account hAccount1 = new Account(); // heap에 Account의 static아닌 메서드 ( deposit, withdrow ) 뜸
        hAccount1.deposit(100, hMoney); // 메서드 호출(입금이라는 행위) << stack에 amount, money, restMoney 뜸
        hMoney = hAccount1.deposit(100, hMoney);
        System.out.println("남은 금액은 : " + hMoney); // return에 의해 호출 메서드는 1100으로 치환됨, 따라서 int타입인 money변수 안에 대입가능
        hMoney = hAccount1.deposit(500, hMoney);
        System.out.println("남은 금액은 : " + hMoney);
        hMoney = hAccount1.withdraw(300, hMoney);
        System.out.println("남은 금액은 : " + hMoney);

        // 임꺽정이 입금을 1번(100원)하고 출금 2번(300원, 500원)하기
        Account iAccount = new Account();
        iMoney = iAccount.deposit(100, iMoney);
        System.out.println("남은 금액은 : " + iMoney);
        iMoney = iAccount.withdraw(300, iMoney);
        System.out.println("남은 금액은 : " + iMoney);
        iMoney = iAccount.withdraw(500, iMoney);
        System.out.println("남은 금액은 : " + iMoney);

    }
}
