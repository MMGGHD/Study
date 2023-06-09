package ex05.ch01;

public class Zealot extends Protoss {
    String name;
    int hp;
    int attack;

    public Zealot(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
