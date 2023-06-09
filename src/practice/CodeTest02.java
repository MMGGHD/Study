package practice;

class shape {
    protected int x, y;

    public void draw() {
        System.out.println("Shape Draw");
    }
}

class Rectangle extends shape {
    // private int width, height;

    public void drow() {
        System.out.println("Rectangle Draw");
    }
}

class Triangle extends shape {
    // private int base, height;

    public void drow() {
        System.out.println("Triangle Draw");
    }
}

class Circle extends shape {
    // private int radius;

    public void drow() {
        System.out.println("Circle Draw");
    }
}

public class CodeTest02 {

    public static void print(shape s) {
        System.out.println("x=" + s.x + " y=" + s.y);
    }

    public static void main(String[] args) {
        Rectangle s1 = new Rectangle();
        Triangle s2 = new Triangle();
        Circle s3 = new Circle();

        print(s3);
        print(s1);
        print(s2);
    }

}