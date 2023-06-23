package ex13;

import java.util.Vector;

class VectorTest01 {

    // public VectorTest01() {

    // Vector v1 = new Vector();
    // v1.add("안녕");
    // v1.add(1);
    // v1.add(3.2);
    // v1.add('a');
    // for (int i = 0; i < v1.size(); i++) {
    // System.out.println(v1.get(i));
    // }
    // }
}

class VectorTest02 {

    VectorTest02() {
        Vector<String> v2 = new Vector<>();
        v2.add("a");
        v2.add("c");
        v2.add("d");
        v2.add("e");
        v2.add("b");
        for (int i = 0; i < v2.size(); i++) {
            System.out.println(v2.get(i));
        }
    }
}

class Monster {
    private String name;
    private double hp;

    Monster(String name, double hp) {
        this.name = name;
        this.hp = hp;
    }

    public String toString() {
        return "{" + name + "," + hp + "}";
    }

}

class VectorTest03 {

    Vector<Monster> v3 = new Vector<>();

    VectorTest03() {
        v3.add(new Monster("슬라임", 50.5));
        v3.add(new Monster("자쿰", 5000.25));
        v3.add(new Monster("혼테일", 6500.55));
        System.out.println(v3);
    }

}

public class Collect0101<T> {
    public static void main(String[] args) {
        new VectorTest03();

    }
}
