public class EX13_11 {
    
    public static long startTime = 0;

    public static class Thread1 extends Thread {
        public void run() {
            for (int i = 0; i < 200; i++) {
                System.out.print(new String("-"));
            }
        }
    }

    public static class Thread2 extends Thread {
        public void run() {
            for (int i = 0; i < 200; i++) {
                System.out.print(new String("|"));
            }           
        }
    }

    public static void main(String[] args) {
        Thread1 th1 = new Thread1();
        Thread2 th2 = new Thread2();
        th1.start();
        th2.start();
        startTime = System.currentTimeMillis();

        // try {
        //     th1.join();
        //     th2.join();
        // } catch (InterruptedException e) {}

        System.out.println("소요시간: " + (System.currentTimeMillis() - EX13_11.startTime));
    }
}
