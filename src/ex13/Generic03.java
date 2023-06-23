package ex13;

class Data<T> {
    int status; // 200
    T body; // 값

}

public class Generic03 {

    /*
     * 제네릭문법에서 와일드카드 '?' 키워드는 리턴타입을 동적으로 설정할수 있다.
     */

    Data<?> getNum(int check) {
        if (check == 1) {
            Data<String> data = new Data<>();
            return data;
        } else {
            Data<Integer> data = new Data<>();
            return data;
        }
    }

    Object getNum2(int check) {
        if (check == 1) {
            return "안녕";
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
    }
}
