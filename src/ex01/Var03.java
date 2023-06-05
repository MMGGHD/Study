package ex01;

public class Var03 {
    public static void main(String[] args) {
        // 업 캐스팅
        int n1 = 10; // 4Byte 공간 변수를 '초기화'
        double d1 = n1; // 8Byte 공간 변수를 '선언'
        // double d1 = n1; 은 가능하다.
        // double 자료형이 더 큰 자료형이기 때문에
        // 자연스럽게 자료형 변환이 되었다.(업 캐스팅) = 묵시적 형변환이 되었다.
        System.out.println(d1);

        // 다운 캐스팅 (명시적 형변환)
        double d2 = 10.5;
        //int n2 = d2; (에러)Type mismatch
        int n2 = (int)d2; // 대입하기전 (int)를 붙인다. = 명시적으로 형변환 해 주었다.
        System.out.println(n2); // 10출력, double 공간의 데이터가 잘려 손실되어 대입된다.

        //문자 형변환 (아스키코드)
        char ch = 65; // char ch = 'A' 라는 코드와 같다. 
        System.out.println(ch);

        byte cha = 66; // 1Byte
        char data = (char)cha; // char가 더 커도 명시적 형변환 해야한다. 애초에 타입이 다르기 때문
        System.out.println(data);
    }
}
