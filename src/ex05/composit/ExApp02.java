package ex05.composit;

public class ExApp02 {
    public static void main(String[] args) {
        // 20% 할인쿠폰으로 콜라 주세요
        Coke c2 = new Coke(400, "콜라");
        // 버거 세트 주세요 (버거, 콜라, 감자 필요)
        Burger b1 = new Burger();
        Coke c1 = new Coke();
        Potato p1 = new Potato();
        BurgerSet bs = new BurgerSet(b1, c1, p1);
        // 버거 세트 시킬때 마다 3개씩 new시키기 귀찮음 -> 새로운 코드 작성 해야함
        BurgerSet bs2 = new BurgerSet();
        BurgerSet bs3 = new BurgerSet(b1, c1, p1);
        BurgerSet bs4 = new BurgerSet(new BigBurger(2200), new Coke(300), new Potato(100));
        bs3.printTotalPrice();
        bs4.printTotalPrice();

    }
}
