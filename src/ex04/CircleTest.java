package ex04;

public class CircleTest {
    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.color = "blue";
        System.out.println("원의 면적 : " + obj.getArea(100));
    }
}
