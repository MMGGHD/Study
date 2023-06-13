package practice;

public class CodeTest02 {

    public static void main(String[] args) {
        String my_string = "banana";
        String is_suffix = "abanana";
        int answer = 0;
        int a = (my_string.length() - is_suffix.length());
        String sub = my_string.substring(a);
        if (a >= 0) {
            answer = 0;
        }
        if (sub.equals(is_suffix)) {
            answer = 1;
        }
        System.out.println(answer);
    }
}
