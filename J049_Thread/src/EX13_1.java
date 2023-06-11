public class EX13_1 {

    // 1. Thread 클래스를 상속받아서 쓰레드 구현
    public static class ThreadCL extends Thread {
        public void run() { // run = 쓰레드가 수행할 작업을 작성
            for (int i = 0; i < 5; i++) {
                System.out.println(this.getName()); // Thread의 메소드 호출
            }
        }
    }

    // 2. Runnable 인터페이스를 받아와서 쓰레드 구현
    public static class ThreadIF implements Runnable {
        @Override
        public void run() { // run = 쓰레드가 수행할 작업을 작성
            for (int i = 0; i < 5; i++) {                
                System.out.println(Thread.currentThread().getName()); // Thread.currentThread(); = 현재 실행중인 쓰레드 반환
            }
        }
    }
    public static void main(String[] args) {
        
        // 1. 클래스로
        ThreadCL t1 = new ThreadCL();

        // 2. 인터페이스로
        Runnable r = new ThreadIF();
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();        
    }
}