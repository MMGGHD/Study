package ex14;

public class Thread01 {

    // CPU가 하나의 스레드를 생성하여 실행한다.
    // 그 하나의 실 == main method

    public static void main(String[] args) {
        // 새로운 실(Thread)
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("서브 스레드" + i);

                try {
                    Thread.sleep(1000); //
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        for (int i = 0; i < 5; i++) {
            System.out.println("메인 스레드" + i);

            try {
                Thread.sleep(1000); //
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
