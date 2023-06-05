package practice;

class 지구인 {
    String name = "지구인";

}

class 아시아인 extends 지구인 {
    String name = "아시아인";
}

class 한국인 extends 아시아인 {
    String name = "한국인";

}

public class CodeTest02 {
    public static void main(String[] args) {
        아시아인 p1 = new 한국인();
        System.out.println(p1.name); // "아시아인"을 출력
    }
}