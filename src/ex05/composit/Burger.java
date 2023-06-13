package ex05.composit;

public class Burger {
    private int price; // 상태는 행위를통해서만 변경(직접적으로 건드릴수 없도록 private)
    private String desc; // 버거의 이름

    public Burger() {
        this(1000, "버거"); // this() 자기자신의 생성자를 가르키는 키워드
    }

    public Burger(int price) {
        this(price, "버거");
    }

    public Burger(int price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public int getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }
}