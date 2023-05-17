package J01_Myown;

public class Queue {

    public static final int ERROR_QUEUE = Integer.MIN_VALUE;
    
    // 속성
    private int[] ar;  // 배열
    private int size;  // 배열의 크기
    private int count; // Queue의 데이터 개수
    private int rear;  // push를 위한 위치정보(왼쪽)
    private int front; // pop을 위한 위치정보(오른쪽)

    // 기본 생성자
    public Queue() {
        rear = 0;
        front = 0;
        ar = null;
        size = 0;
    }

    // 오버로딩 생성자
    public Queue(int size) {
        rear = 0;
        front = 0;
        ar = new int[size];
        this.size = size;
    }

    // 초기화 함수
    public boolean init(int size) {
        rear = 0;
        front = 0;
        ar = new int[size];
        this.size = size;
        return true;
    }


    
    ////////////// METHOD //////////////////////////////////////


    
    // isFull: 배열이 가득 찼니?
    public boolean isFull() {
        if (count == size) {
            return true;
        }
        return false;
    }

    // enqueue: 데이터 넣기
    public boolean enqueue(int data) {
        if (isFull()) {
            return false;
        }

        ar[rear] = data;
        rear++;
        count++;

        if(rear == size) {
            rear = 0;
        }

        return true;
    }




    // isEmpty: 배열이 비어 있니?
    public boolean isEmpty() {
        if (count == 0) {
            return true;
        }
        return false;
    }

    // dequeue: 데이터 빼기
    public int dequeue() {
        if(isEmpty()) {
            return ERROR_QUEUE;
        }
        int data = ar[front];
        count--;
        front++;
        return data;
    }




    // printAll: 배열 요소를 전부 출력하기
    public void printAll() {
        int range; // 범위를 어떻게 정할까?
        if (rear > front) {
            range = rear - front;
        }
        range = front - rear;

        for (int i = 0; i < range; i++) {
            System.out.println(ar[i]);
            range--;
        }
    }
}
