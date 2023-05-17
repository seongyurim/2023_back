package J01_PT;
import java.util.Arrays;

public class Stack {

    public static final int ERROR_STACK = Integer.MIN_VALUE;
    
    // 속성
    int size;          // 배열의 길이
    int SP;           // 스택포인터(SP)
    int[] stackArray; // 배열

    // 기본 생성자
    public Stack() {
     size = 0;
        SP = 0;
        stackArray = null;
    }

    // 오버로딩 생성자
    public Stack(int size) {
        this.size = size;
        this.SP = 0;
        this.stackArray = new int[size];
    }


    /////////////////// METHOD ////////////////////////////////////////////////////////////////////

    // isOverflow: 스택배열이 가득 차있나?
    // true = 스택포인터가 배열크기를 가리키고 있으므로
    private boolean isOverflow() {
        return SP == size;
    }


    // isUnderflow: 스택배열이 비어 있나?
    // true = 스택포인터가 0이면 데이터가 없는 상태이므로
    private boolean isUnderflow() {
        return SP == 0;
    }


    // push: 데이터 넣기
    public boolean push(int num) {
        if (isOverflow()) {
            return false;
        }
        // 전달받은 num을 배열에 저장하고 스택포인터(SP) 증가
        stackArray[SP] = num;
        SP++;
        return true;
    }


    // pop: 데이터 빼기
    public int pop() {
        if (isUnderflow()) {
            return ERROR_STACK;
        }
        SP--;
        return stackArray[SP];
    }


    // printAll: 전체 배열요소 출력
    public void printAll() {
        int count = SP;
        int index = SP - 1;
        for (int i = 0; i < count; i++) {
            System.out.println(stackArray[index]);
            index--;
        }
    }
}
