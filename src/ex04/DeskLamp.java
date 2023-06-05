package ex04;

public class DeskLamp {
    boolean isOn;

    void turnOn() {
        isOn = true;
    }

    void turnOff() {
        isOn = false;

    }

    public String print() {
        return "현재 상태는 " + (isOn == true ? "켜짐" : "꺼짐");
    }
}
