package ex04;

class player {
    String name;
    int thirty; // 0~100 (클수록 목말라짐) <<범주(도메인이 정해져있다 - 나중에 if로 처리해야함)

    public player(String name, int thirty) {
        this.name = name;
        this.thirty = thirty;
    }

    public void drink() {
        thirty = thirty - 30;
    }
}

public class OOP01 {
    public static void main(String[] args) {
        player p1 = new player("홍길동", 100); // 아직 null상태
        player p2 = new player("임꺽정", 100); // 아직 null상태
        System.out.println(p1.name);
        System.out.println(p2.name);

        p2.drink();

        System.out.println(p1.thirty);
        System.out.println(p2.thirty);
    }
}
