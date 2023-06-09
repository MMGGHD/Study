package ex05.ch03;

abstract class Ani {

    abstract String getName();

    abstract void setSpot(int distance);

    abstract int getSpot();

    abstract int getSpeed();

    abstract int getSecond();

}

class Rabbit extends Ani {
    String name;
    final int speed = 10;
    int spot;
    int second;

    Rabbit(String name, int spot, int second) {
        this.name = name;
        this.spot = spot;
        this.second = second;
    }

    String getName() {
        return name;
    }

    void setSpot(int distance) {
        this.spot = distance;
    }

    int getSpot() {
        return spot;

    }

    int getSpeed() {
        return speed;
    }

    int getSecond() {
        return second;
    }
}

class Tutle extends Ani {
    String name;
    final int speed = 5;
    int spot;
    int second;

    Tutle(String name, int spot, int second) {
        this.name = name;
        this.spot = spot;
        this.second = second;
    }

    String getName() {
        return name;
    }

    void setSpot(int distance) {
        this.spot = distance;
    }

    int getSpot() {
        return spot;
    }

    int getSpeed() {
        return speed;
    }

    int getSecond() {
        return second;
    }
}

public class Exten04 {

    public static void run(Ani a1, Ani a2) {
        a1.setSpot(a1.getSpot() + a1.getSpeed() * a1.getSecond());
        a2.setSpot(a2.getSpot() + a2.getSpeed() * a2.getSecond());
        System.out.println(
                a1.getName() + "의 현재위치는 " + a1.getSpot() + "m, " + a2.getName() + "의 현재위치는 " + a2.getSpot() + "m");
        if (a1.getSpot() == 100) {
            System.out.println(a1.getName() + " 골인");
        }
        if (a2.getSpot() == 100) {
            System.out.println(a2.getName() + " 골인");
        }
    }

    public static void main(String[] args) {
        Ani r1 = new Rabbit("토끼1", 10, 3);
        Ani t1 = new Tutle("거북1", 20, 1);
        run(r1, t1);
        run(r1, t1);
        run(r1, t1);
    }
}