import javax.swing.JOptionPane;

public class EX13_5 {

    public static class ThreadExam extends Thread {

        public void run() {
            // 작업B - 숫자 출력하기
            int count = 10;
            for (int i = 0; i < 10; i++) {
                System.out.println(count);            
                try {
                    Thread.sleep(1000); // 1초간 시간 지연시키기
                } catch(Exception e) {}
                count--;
            }
        }
    }

    public static void main(String[] args) {      
        
        ThreadExam th = new ThreadExam();
        th.start();
        
        // 작업A - 사용자에게 입력받기
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
        System.out.println("입력하신 값은 " + input + " 입니다.");
    }
}