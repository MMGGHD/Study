package ex04;

class TvSet {

    String tvSet(int channal, int sound, boolean powerOn) {
        String power = powerOn == true ? "켜짐" : "꺼짐";
        return "TV 볼륨은 " + sound + "이고 채널은 " + channal + ", 전원은 " + power;
    }
}

public class Tv {
    public static void main(String[] args) {
        TvSet my = new TvSet();
        System.out.println(my.tvSet(31, 9, true));
    }
}
