package ex05.ch01;

public class App {

    static void attack(Protoss u1, Protoss u2) {
        u2.setHp(u2.getHp() - u1.getAttack());
        System.out.println(u2.getName() + "이 " + u1.getName() + "에게 공격당했습니다.");
        System.out.println(u2.getName() + "의 남은 hp : " + u2.getHp());

    }

    public static void main(String[] args) {
        Zealot z1 = new Zealot("질럿1", 100, 10);
        Zealot z2 = new Zealot("질럿2", 100, 10);
        Dragoon d1 = new Dragoon("드라군1", 100, 5);
        Dragoon d2 = new Dragoon("드라군2", 100, 5);
        DarkTempler dt1 = new DarkTempler("다크1", 80, 50);
        DarkTempler dt2 = new DarkTempler("다크2", 80, 50);

        // 질럿1이 드라군1을 공격
        attack(z2, z1); // 클래스를 넘기면 클래스의 모든것을 한번에 인자로 넘길수 있다.
        attack(z1, d1);
        attack(z1, dt1);
        attack(d2, d1);
        attack(d1, z1);
        attack(dt2, dt1);
        attack(dt1, d1);
        attack(dt1, z1);
    }
}