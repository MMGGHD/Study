package ex13;

/*싱글톤패턴(instance) << new에 대한 제어권이 없기때문에 제네릭기법을 이용할수 없다.
여기서 자료형을 모르는 변수를 넣을때는 Object 자료형을 이용하여 다운캐스팅 하게끔 만든다.
>> 제어권이 없는 객체의 변수의 타입은 무조건 오브젝트 타입이 들어간다.
*/

class Yun {
    private Object data;
    private static Yun instance = new Yun();

    private Yun() {
    }

    public Object getData() {
        return data;
    }

    public static Yun getInstance() {
        return instance;
    }

    public static void setInstance(Yun instance) {
        Yun.instance = instance;
    }

    public void setData(Object data) {
        this.data = data;
    }

}

public class Generic02 {
    public static void main(String[] args) {
        Yun d1 = Yun.getInstance();
        d1.setData(1);

        int value = (int) d1.getData();
        System.out.println(value);
    }
}
