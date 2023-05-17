public class App {

    public static int rear = 0;
    public static int size = 5;

    public static void enqueue() {
        System.out.println(rear);
        rear = (rear + 1) % size;
    }



    public static void main(String[] args) throws Exception {
        
        enqueue();
        enqueue();
        enqueue();
        enqueue();
        enqueue();
        enqueue();
        enqueue();
        enqueue();
        enqueue();
        enqueue();
        enqueue();
        enqueue();
        enqueue();
        enqueue();
        enqueue();
        enqueue();

    }
}
