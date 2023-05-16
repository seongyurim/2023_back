package J02_StackRe;

public class Stack {
 
    public static final int ERROR_STACK = Integer.MAX_VALUE;
    private int sp; // 스택포인터: push와 pop의 위치정보
    private int[] ar;
    private int size;

    // 기본 생성자
    public Stack() {
        sp = 0;
        ar = null;
        size = 0;
    }

    // 오버로딩 생성자
    public Stack(int size) {
        sp = 0;
        this.size = size;
        ar = new int[size];
    }

    public boolean init(int size) {
        sp = 0;
        this.size = size;
        ar = new int[size];
        return true; // 강사님이 안해주셔서 우선 써둠-_-;
    }

    public boolean isOverflow() {
        if (sp == size) {
            return true;
        }
        return false;
    }

    // data: 집어넣을 정수
    // return
    //   true: push 성공
    //   false: push 실패
    public boolean push(int data) {
        if (isOverflow()) {
            return false;
        }
        ar[sp] = data;
        sp++;
        return true;
    }

    public boolean isUnderflow() {
        if (sp == 0) {
            return true;
        }
        return false;
    }

    // return: 정상인 경우 data를 리턴
    public int pop() {
        if (isUnderflow()) {
            return ERROR_STACK; // 데이터를 넣을 때 이런 데이터는 넣지 않으므로
                                // -1로 하면 실제 데이터인지, 지금 설정한 값인지 알 수 없기 때문이다.
                                // 전역변수를 정의하여 리더빌리티 향상
        }
        sp--;
        return ar[sp];
    }
}
