package J01_Myown;

public class QueueTest {
    public static void main(String[] args) {
        
        Queue queue = new Queue(5);
        boolean res;
        int data;

        res = queue.enqueue(11);
        res = queue.enqueue(22);
        res = queue.enqueue(33);
        res = queue.enqueue(44);
        res = queue.enqueue(55);

        data = queue.dequeue();
        data = queue.dequeue();
        data = queue.dequeue();
        data = queue.dequeue();
        data = queue.dequeue();

        res = queue.enqueue(66);
        res = queue.enqueue(77);

        queue.printAll();
    }
}
