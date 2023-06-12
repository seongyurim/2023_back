import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {
    public static void main(String[] args) {
        
        //임의의 String 4개를 Stack에 집어넣고 빼는 코드를 만들어보세요.

        // 1. 스택을 만든다. (Deque I/F)
        // Deque<String> deque = new LinkedList<>(); // 가능 // 순서대로 넣고 빼는 경우에 사용 권고
        Deque<String> deque = new ArrayDeque<>(); // 가능(환영큐) // 주로 읽기를 사용하는 경우에 사용 권고
        // 왜냐하면 예를 들어 5만번째 리스트를 읽어야 하는 경우 LinkedList를 사용하면
        // 모든 데이터를 다 읽어와야 특정 데이터를 찾아낼 수 있으므로 시간이 오래 걸리기 때문이다.

        // 2. push
        deque.push("도");
        deque.push("레");
        deque.push("미");
        deque.push("파");
        System.out.println(deque); // [도, 레, 미, 파]

        // 3. pop
        System.out.println(deque.peek()); // 파
        System.out.println(deque.pop()); // 파
        System.out.println(deque); // [도, 레, 미]

    }
}
