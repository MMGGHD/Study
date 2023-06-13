package ex05.composit;

public class BigBurger extends Burger {

    public BigBurger() {
        super(1500, "빅버거");
    }

    public BigBurger(int price) {
        super(price, "빅버거");
    }

    public BigBurger(int price, String desc) {
        super(price, desc);
    }
}
