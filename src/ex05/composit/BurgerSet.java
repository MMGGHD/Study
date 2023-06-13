package ex05.composit;

public class BurgerSet { // 버거와 콜라와 감자를 담고있는 구성(composition)
    // new는 다른데서 하고 가져오기만 한것
    private Burger burger;
    private Coke coke;
    private Potato potato;

    public BurgerSet() { // 생성자로 구성원 3개를 한번에 new하는 방법
        this(new Burger(), new Coke(), new Potato());
    }

    BurgerSet(Burger burger, Coke coke, Potato potato) {
        this.burger = burger;
        this.coke = coke;
        this.potato = potato;
    }

    public Burger getBurger() {
        return burger;
    }

    public Coke getCoke() {
        return coke;
    }

    public Potato getPotato() {
        return potato;
    }

    public void printTotalPrice() {
        System.out.print(burger.getDesc() + "+" + coke.getDesc() + "+" + potato.getDesc() + "의 총 가격은 ");
        System.out.println(burger.getPrice() + coke.getPrice() + potato.getPrice() + "원");
    }
}
