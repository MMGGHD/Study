package ex04;

class Cal02 {

    void triple(int n1, int n2, int n3) {
        System.out.println(n1 + n2 + n3);
    }

    class Cal021 {
        void add(int n1, int n2) {
            System.out.println("더하기 : " + (n1 + n2));
        } // 스택을 종료하고, 복귀 주소를 확인하고 복귀한다.

        void minus(int n1, int n2) { // minus
            System.out.println("빼기 : " + (n1 - n2));
        }

        void multi(int n1, int n2) { // multi
            System.out.println("곱하기 : " + (n1 * n2));
        }

        void divide(int n1, int n2) { // divide
            System.out.println("나누기 : " + (n1 / n2));
        }
    }
}

public class Meth02 {
    public static void main(String[] args) {
        // Cal021.Cal021 c1 = new Cal021.Cal021();
        // c1.add(3, 4);
        // c1.minus(10, 5);
        // c1.divide(12, 3);
    }
}
