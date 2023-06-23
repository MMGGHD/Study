package ex13;

import java.util.*;

class Iter {

    Iterator<Integer> e;

    Iter() {
        /*
         * 컬렉션인 List 메서드중 iterator()는
         */
        e = Collect01.list.iterator();
        int s;
        while (e.hasNext()) {
            s = (int) e.next();
            System.out.println(s);
        }
    }
}

class Array {

    public Array() {
        for (int s : Collect01.list) {
            System.out.println(s);
        }
    }
}

public class Collect01 {

    public static Integer[] a = new Integer[] { 1, 2, 3, 4, 5, 6 };
    public static List<Integer> list = Arrays.asList(a);

    public static void main(String[] args) {
        new Iter();
    }
}
