package ex05.ch03;

class 동물 {
    String name = "동물";
}

class 사자 extends 동물 {

    String name = "사자";
}

class 호랑이 extends 동물 {
}

public class Exten01 {
    public static void main(String[] args) {
        동물 r1 = new 사자();
        System.out.println(r1.name);
    }
}
