public class App {
    public static void main(String[] args) throws Exception {
        
        // Queue
        
        int[] data = new int[7];

        int rear = 0;
        
        while(true) {
            rear = (rear + 1) % 7; // 공식연산
            System.out.println(rear);
        }
    }
}
